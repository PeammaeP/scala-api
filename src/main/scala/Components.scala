import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import scala.io._

trait AkkaComponent { 
    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    implicit val executionContext = system.executionContext
}

import spray.json.RootJsonFormat
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._

trait RoutingComponent extends JsonMarshallerComponent {
    val route: Route = pathPrefix("message") { 
        ping ~ newMessage
    }
    val ping: Route = pathEnd { {
            get{ 
                complete("OK")
            }
        } 
    }
    val newMessage: Route = pathEnd { 
        post { 
            entity(as[Message]) { message => 
                println(message)
                complete("POST")
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