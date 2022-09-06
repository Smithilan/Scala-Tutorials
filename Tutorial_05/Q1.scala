package Tutorial_05

object Q1{
  def GCD(a:Int,b:Int):Int=b match{
  case 0 => a
  case b if b>a => GCD(b,a)
  case _ => GCD(b,a%b)
}

  def prime(p:Int,n:Int=2):Boolean=n match {
    case x if (x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }
  def main(args:Array[String]){

    println(" 2 is a prime number ? "+ prime(2))
    print("\n")
    println(" 8 is a prime number ? "+ prime(8))
    print("\n")

  }

}
