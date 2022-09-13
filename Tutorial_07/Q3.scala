package Tutorial_07

object Q3 extends App{


  var a1 = new Account("997256123v" , 1 , -2000)
  var a2 =  new Account("996542753v" , 2 , 1000)

  a1.transfer(100,a2)

  println(a1.getBalance)
  println(a2.getBalance)

}
