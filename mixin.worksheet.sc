class MessageContainer { 
    val message = "I'm an instance of class B" 
}

trait MakeThingLoud { 
    def loudMessage(message : String): String = message.toUpperCase()
}

class B extends MessageContainer with MakeThingLoud {}

val B = new B with MakeThingLoud
B.loudMessage(B.message)


