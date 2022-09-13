package Tutorial_07


  object Bank extends App {

    var bank : List[Account] = List( new Account("997256123v" , 1 , -2000) , new Account("996542753v" , 2 , 1000) )

    val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

    val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

    val interest = ( b : List[Account] ) => b.map( x => {
      x.balance match {
        case a if a >= 0 => x deposit x.balance * 0.05
        case _ => x withdraw Math.abs(x.balance) * 0.01

      }
      x
    })



    println("overdraft " + overdraft( bank ) )//4.1
    println("balance " + balance( bank )._2 )//4.2

    bank = interest( bank )
    println("bank " + bank )
    println("balance " + balance( bank )._2 )//4.3

  }


