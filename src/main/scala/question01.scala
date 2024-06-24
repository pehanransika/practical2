object calculator {
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  def calculate(): Unit = {
 
  val resultA =   k + 12 * m
  
  val resultB = m / j
  
  val resultC =  n % j

  val resultD =  m / j * j

  val resultE =   f + 10 * 5 + g

  var resultF =  i += 1
      resultF = i * n

  println(s"k + 12 * m = $resultA")
  println(s"m / j = $resultB")
  println(s"n % j = $resultC")
  println(s"m / j * j = $resultD")
  println(s"f + 10 * 5 + g = $resultE")
  println(s"++i * n = $resultF")
}
  def main(args: Array[String]): Unit = {
    
    calculate()
  }
}
