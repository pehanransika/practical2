object FunctionalProgrammingApproach {

  var a = 2
  var b = 3
  var c = 4
  var d = 5
  val k = 4.3f
  val g = 4.0f

  def main(args: Array[String]): Unit = {

    b -= 1
    val resultA = b * a + c * d
    println(s"Expression a: $resultA")
    d -= 1

    a += 1
    println(s"Expression b: $a")
  
    val resultC = -2 * (g - k) + c
    println(s"Expression c: $resultC")

    println(s"Expression d: $c")
    c += 1

    c += 1
    c = c * a
    a += 1
    println(s"Expression e: $c")
  }
}
