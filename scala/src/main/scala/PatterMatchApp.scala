// case class: immutable

// ★Imutableなクラス
case class Point(x: Int, y: Int)

object PatterMatchApp {

  def main(args: Array[String]): Unit = {

    val points = List(
      Point(5, 3),
      Point(0, 0),
      Point(3, 4)
    )

    points.foreach(_ match {
      case Point(0, 0) => println("origin!")
      case Point(5, _) => println("right edge!")
      case Point(x, y) => println(s"$x:$y")
    })

  }

}