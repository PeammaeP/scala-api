import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success , Failure}

def longRunningJob() = Future { Thread.sleep(5 * 1000); 42 } 
val maybe = longRunningJob() //delay 10 sec 

maybe.onComplete{
    case Success(value) => println(value)
    case Failure(exception) => println("Something Wrong")
}

def nextJob() = println("Next Done !")
nextJob()

Thread.sleep(7 * 1000)