object LambdaApp {

  def main(args: Array[String]): Unit = {
    val prices = List(53.2, 48.2, 32.8)

    // prices.map((n: Double) => n * 1.08)
    // prices.map(n => n * 1.08)
    // ★_ :プレースホルダー
    prices.map(_ * 1.08).filter(_ > 50).foreach(println)
  }

}