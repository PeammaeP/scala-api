error id: file://<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala:[220..221) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala", "import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.Http
import scala.io._

trait { 
implicit val system = ActorSystem(Behaviors.empty, "my-system")
implicit val executionContext = system.executionContext
}
object AkkaHttpSimple extends App {
  val route: Route = path("hello") { 
    complete("ok")
  }

  val bindingFuture = Http().newServerAt("localhost" , 8080).bind(route)
  println("Press Enter to Stop Server")
  StdIn.readLine()
}
")
file://<WORKSPACE>/file:<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala
file://<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala:8: error: expected identifier; obtained lbrace
trait { 
      ^
#### Short summary: 

expected identifier; obtained lbrace