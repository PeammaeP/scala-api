import org.mongodb.scala._
import org.mongodb.scala.model.Aggregates._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._
import org.mongodb.scala.model.Updates._
import org.mongodb.scala.model._

import scala.collection.JavaConverters._
import scala.util.{Success , Failure}
import scala.concurrent.Future
import org.mongodb.scala.result.InsertOneResult
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import com.mongodb.client

trait MongoRepository {
    val mongoClient: MongoClient = MongoClient()
    val database: MongoDatabase = mongoClient.getDatabase("my-database")
    val collection: MongoCollection[Document] = database.getCollection("my-collection")

    // we use the future to implement this 
    def newMessage(message: Message) = { 
        val doc: Document = Document(
        "_id" -> message.id , 
        "sender" -> message.sender,
        "content" -> message.content, 
    )
        val maybeDoc = collection.insertOne(doc).toFuture()
        maybeDoc.onComplete{
            case Success(value) => println(value)
            case Failure(exception) => println("Failed to insert")
        }
    }
}
