object EitherApp {

  // Error
  // ★Either：正しい値かどうか
  // - Right：正しい値
  // - Left：違う場合

  def div(a: Int, b: Int): Either[String, Int] = {
    if (b == 0) Left("Zero div error!")
    else Right(a / b)
  }

  def main(args: Array[String]): Unit = {

    // div(10, 0) match {
    div(10, 3) match {
      case Right(n) => println(n)
      case Left(s) => println(s)
    }

  }

}