package Tutorial_05

object Q3 {
  def Sum(x:Int):Int=x match{
  case x if x <= 1 => x
  case _ => x+Sum(x-1)

}

  def main(args:Array[String]): Unit = {

    println(Sum(3))

  }


}
