def fromStringToInt(value : String) : Option[Int] = { 
    try { 
       Some(Integer.parseInt(value))
    }
    catch { 
       case e : Exception => None
    }
}

val x = fromStringToInt("9")
val y = fromStringToInt("a")


val a = x.get
val b = y.getOrElse(0)

y match {
    case Some(value) => println(value)
    case None => println("None")
}