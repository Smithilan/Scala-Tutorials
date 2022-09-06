package Tutorial_03

object Q4 {
  def bookPrice(x:Int):Double=x*24.95
  def discount(x:Double):Double= x*.4
  def shippingCost(x:Int):Double=3*x+(x-50)*.75
  def totalCost(x:Int):Double=bookPrice(x)-discount(bookPrice(x))+shippingCost(x)

  def main(args: Array[String]){
    println("Total cost for 60 copies = "+totalCost(60))
  }
}
