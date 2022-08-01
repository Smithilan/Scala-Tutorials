package Tutorial_04

object Q2 { def main(args: Array[String]): Unit= {
  println("Enter a Number :")


  var number=scala.io.StdIn.readInt()

  def Input(x:Int):Unit= x match {
    case y :Int if x<=0 => println("Negative/Zero Number")
    case y :Int if x%2==0 =>println("Even Number")
    case y :Int if x%2!=0 =>println("Odd Number")
  }
  Input(number)

}
}


