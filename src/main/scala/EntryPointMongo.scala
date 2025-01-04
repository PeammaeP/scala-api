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

object EntryPointMongo extends App {
    val mongoClient: MongoClient = MongoClient()
    val database: MongoDatabase = mongoClient.getDatabase("my-database")
    val collection: MongoCollection[Document] = database.getCollection("my-collection")

    val doc: Document = Document(
        "_id" -> 0 , 
        "name" -> "MongoDB",
        "type" -> "Database", 
        "count" -> 1,
        "info" -> Document("x" -> 203, "y" -> 102)
    )
    // we use the future to implement this 
    // val maybeDoc: Future[InsertOneResult] = collection.insertOne(doc).toFuture()
    // maybeDoc.onComplete{
    //     case Success(value) => println(value)
    //     case Failure(exception) => println("Failed to insert")
    // }

    val maybeTarget: Future[Document] = collection.find(equal("_id" , 0)).first().toFuture()
    maybeTarget.onComplete{ 
        case Success(value) => println(s"Value ${value.toJson()}")
        case Failure(exception) => println("Couldn't find the document")
    }
}
