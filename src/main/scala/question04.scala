object MovieHall {
    
    def calculateCost(attendance: Int): Double = {
        3 * attendance + 500
    }
    
    def calculateAttendance(ticketPrice: Int): Int = {
        120 + ((15 - ticketPrice) / 5) * 20
    }
    
    def calculateProfit(ticketPrice: Int): Double = {
        val attendance = calculateAttendance(ticketPrice)
        val revenue = ticketPrice * attendance
        val costs = calculateCost(attendance)
        val profit = revenue - costs
        profit
    }

   def findOptimalTicketPrice(): Int = {
        var bestPrice = 15
        var bestProfit = calculateProfit(bestPrice)
        
        for (change <- Seq(-5, 5)) {
            var price = 15 + change
            while (price >= 5 && price <= 100) {
                val currentProfit = calculateProfit(price)
                if (currentProfit > bestProfit) {
                    bestProfit = currentProfit
                    bestPrice = price
                }
                price += change
            }
        }
        
        bestPrice
    }

    def main(args: Array[String]): Unit = {

        val optimalPrice = findOptimalTicketPrice()
        println(s"Optimal Prce =  Rs $optimalPrice")
    }
}
