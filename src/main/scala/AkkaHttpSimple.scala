import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import scala.io._

object AkkaHttpSimple extends App {
  implicit val system = ActorSystem(Behaviors.empty, "my-system")
  implicit val executionContext = system.executionContext

  val route: Route = path("hello") { 
    complete("ok")
  }

  val bindingFuture = Http().newServerAt("localhost" , 8080).bind(route)
  println("Press Enter to Stop Server")
  StdIn.readLine()
}
