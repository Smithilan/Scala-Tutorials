package Tutorial_04

object Q3 { def main(args: Array[String]): Unit = {


  def toUpper(x:String):String={
    return (x.toUpperCase())

  }
  def toLower(x:String):String={
    return(x.toLowerCase())
  }

  def formatNames(f:String=>String,x:String): Unit ={
    val Str=f(x)
    print(Str)
  }
  formatNames(toUpper,"Benny ")
  println()
  formatNames(toUpper,"Niroshan ".slice(0,2))
  formatNames(toLower,"Niroshan ".slice(2,8))
  println()
  formatNames(toLower,"Saman ".slice(0,6))
  println()
  formatNames(toUpper,"Kumara ".slice(0,1))
  formatNames(toLower,"Kumara ".slice(1,5))
  formatNames(toUpper,"Kumara ".slice(5,6))


}
}


