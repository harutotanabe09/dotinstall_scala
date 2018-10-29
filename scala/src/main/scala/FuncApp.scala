object FuncApp {

  // 関数 Input -> Output 戻り値があるやーつ

  // method
  def mult(a: Int, b: Int) = a * b

  // ★ 関数オブジェクト Newでもかける　ラムダのような
  // 引数 => 処理
  // val multFunc: (Int, Int) => Int = (a: Int, b: Int) => a * b　省略しない書き方
  // val multFunc = (a: Int, b: Int) => a * b
  val multFunc = (_: Int) * (_: Int)

  def main(args: Array[String]): Unit = {
    // println(multFunc(3, 5)) // 15
    println(multFunc(2, 4)) // 8
  }

}