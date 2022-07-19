package Tutorial1_20001932

object Q4_a extends App{
  def wage(hours:Int):Int=hours*250
  def ot(hours:Int):Int=hours*85
  def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2)
  def tax(income:Double):Double=income*.12
  def takeHome(h1:Int,h2:Int):Double=
    income(h1,h2)-tax(income(h1,h2))
  println("Salary for 20 hours normal work time and 10 hours Over time = "+takeHome(20,10))
}


