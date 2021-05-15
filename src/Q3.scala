object Q3 extends App {
  var bookPrice = 24.95
  var noOfBooks = 60
  var newBookPrice = bookPrice * noOfBooks * 0.6

  def shippingCost(copies:Int): Double ={
    if(copies>=50) 3+(copies-50)*0.75
    else 3
  }

  val totalShippingCost=shippingCost(noOfBooks)
  val totalPrice = newBookPrice + totalShippingCost

  println("Total wholesale cost is " + totalPrice)
}
