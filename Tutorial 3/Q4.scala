object Question_4 extends App {

  // applicable only when numOfCovers>50
  var coverPrice: Double = 24.95
  var numOfCovers: Int = 60
  var total: Float = 0

  def bookPrice(numOfCovers: Int): Double = numOfCovers * 24.95
  def discount(total: Double): Double = total * 0.4
 def shipping(numOfCovers: Int): Double = 3 + (numOfCovers - 50) * 0.75

  var FinalCost: Double = (bookPrice(numOfCovers) - discount(bookPrice(numOfCovers)) + shipping(numOfCovers))

  println("Total cost for the books  " +FinalCost )
}