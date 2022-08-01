package Tutorial_04

object Q1 {
  def main(args: Array[String]): Unit = {
    var Interest:Double=0
    def FindInterest(i: Double): Unit = {
      if(i<=20000){
        Interest=i*2.0/100
      }
      else if(i<=200000){
        Interest=i*4.0/100
      }
      else if(i<=2000000){
        Interest=i*3.5/100
      }
      else{
        Interest=i*6.5/100
      }
    }

    FindInterest(1000000)
    println("Interest :"+Interest)

  }
}


