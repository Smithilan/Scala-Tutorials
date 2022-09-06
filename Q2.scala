package Tutorial_05

object Q2 {
    def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int,n:Int=2):Boolean=n match {
    case x if x==p => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }
  def primeSeq(n:Int):Unit={

    var y = n
    while(y>0){

      if(prime(y)){
        println(y)
      }
      y = y - 1

    }

  }
  def main(args:Array[String]): Unit = {

    primeSeq(18)

  }

}
