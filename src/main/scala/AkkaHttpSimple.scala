import akka.http.scaladsl.Http
import scala.io._

object AkkaHttpSimple extends AkkaComponent with RoutingComponent {
  val bindingFuture = Http().newServerAt("localhost" , 8080).bind(route)
  println("Press Enter to Stop Server")
  
  StdIn.readLine()
  bindingFuture.flatMap(_.unbind()).onComplete(_ => system.terminate())
}
