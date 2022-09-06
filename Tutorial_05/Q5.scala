package Tutorial_05

object Q5 {
  def sum_of_even(n:Int): Int ={


    if (n==0)
      return 0
    if (n % 2 != 0)
      return sum_of_even(n-1)
    else
      return n + sum_of_even(n-1)

  }


  def main(args:Array[String]): Unit ={

    println(sum_of_even(12))

  }

}
