package Tutorial_08

case class Point(var a:Int,var b:Int)extends operators{

  def add(p:Point) = Point(a+p.a, b+p.b)
  def move(dx:Int,dy:Int) = Point(this.a+dx,this.b+dy)
  def distance(p:Point):Double = {

    var dx = this.a-p.a
    var dy = this.b-p.b

    var dist = dx*dx + dy*dy

    scala.math.sqrt(dist)

  }
  def invert(): Unit ={
    var temp = this.a
    this.a = this.b
    this.b = temp
  }

}
