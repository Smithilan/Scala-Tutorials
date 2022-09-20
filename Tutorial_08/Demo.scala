package Tutorial_08

object Demo extends App {

  val p1 = Point(2, 3)
  val p2 = Point(4, 5)
  val p3 = p1.add(p2)

  println(p3) // part A

  // -----------------------------------------------

  val p4 = p1.move(7, 4) // Part B
  println(p4)

  // ------------------------------------------------

  val p5 = p1.distance(p2) // part C
  println(p5)

  // -------------------------------------------------

  println("Before inverting " + p1) // Part D
  p1.invert()
  println("After inverting " + p1)

}
