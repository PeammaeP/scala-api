import slick.sql.SqlProfile.ColumnOption.SqlType
import slick.jdbc.PostgresProfile.api._
import slick.lifted.ProvenShape
// postgreSQL profile

final class MessageTable(tag : Tag) extends Table[Message](tag , "message") {
    def id = column[Long]("id" , O.PrimaryKey , O.AutoInc) // primary key and auto increment 
    def sender = column[String]("sender")
    def content = column[String]("content")

    override def * = (sender , content , id) <> (Message.tupled , Message.unapply)
}
