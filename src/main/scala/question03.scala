object SalaryCalculator {
  val normalPayRate = 250
  val otPayRate= 85
  val taxRate = 0.12


  def calculateGrossPay(workingHours: Double, otHours: Double): Double = {
    workingHours*normalPayRate + otHours * otPayRate
  }

  def calculateNetPay(grossPay: Double): Double = {
    grossPay*(1-taxRate)
  }

  def main(args: Array[String]): Unit = {
    val workingHours: Int = 40
    val otHours: Int = 30

    val grossPay = calculateGrossPay(workingHours,otHours)
    val netPay = calculateNetPay(grossPay)

    println(f"Take-home salary) is Rs.$netPay%.2f")
  }
}
