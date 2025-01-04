val message: String = "Hello"
implicit val name: String = "World!"
def disp(implicit nm : String) = message + nm

val result1 = disp("skooldio")
val result2 = disp



