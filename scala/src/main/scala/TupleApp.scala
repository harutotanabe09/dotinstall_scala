object TupleApp {

  // 戻り値がタプル
  def swap(a: Int, b: Int) = (b, a)

  def main(args: Array[String]): Unit = {
    // ★tuple ：　複数の値をまとめてわたす　丸かっこでくくる
    // 23個以上は入らないという制限あり
    // val data = (12, "taguchi", 52.4)
    // println(data._1)
    // println(data._2)
    // println(data._3)

    val (x, y) = swap(30, 20)
    println(x) // 20
    println(y) // 30

  }

}