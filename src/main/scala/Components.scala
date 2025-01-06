import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import scala.io._
import scala.concurrent.Future
import org.postgresql.translation.messages_pl
import akka.http.scaladsl.server.StandardRoute

trait AkkaComponent { 
    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    implicit val executionContext = system.executionContext
}

import spray.json.RootJsonFormat
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._

trait RoutingComponent extends JsonMarshallerComponent with Repository {
    val route: Route = pathPrefix("message") { 
        ping ~ newMessage ~ allMessage
    }
    val ping: Route = path("ping") { 
        {
            get{ 
                complete("OK")
            }
        } 
    }
    val newMessage: Route = pathEnd { 
        post { 
            entity(as[Message]) { message => 
                println(message)
                newMessage(message)
                complete("POST")
            }
        }
    }
    val allMessage = pathEnd { 
        get{ 
            val maybeAllMessage: Future[Seq[Message]] = getAllMessage
            onSuccess(maybeAllMessage) { 
                case messages: Seq[Message] => complete(messages.toList)
                case _ => complete(StatusCodes.NotFound) 
            }
        }
    }
}

import spray.json.RootJsonFormat
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._

trait JsonMarshallerComponent { 
    implicit val messageJson: RootJsonFormat[Message] = jsonFormat3(Message)
}

import slick.jdbc.PostgresProfile
import slick.jdbc.PostgresProfile.api._
import slick.lifted.TableQuery

trait SlickComponent {
    lazy val messages: TableQuery[MessageTable] = TableQuery[MessageTable]
    val db: PostgresProfile.backend.DatabaseDef = Database.forConfig("basicSlick")
}