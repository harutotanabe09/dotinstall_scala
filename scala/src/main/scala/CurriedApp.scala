object CurriedApp {

  def main(args: Array[String]): Unit = {
    // 関数のカリー化 関数は関数を返すことができる
    val multFunc = (a: Int, b: Int) => a * b
    // 一つだけの引数で再構成する関数
    val multFuncCurried = (a: Int) => ((b: Int) => a * b)

    // println(multFunc(3, 5))
    // println(multFuncCurried(3)(5))

    val double = multFuncCurried(2)
    val tripple = multFuncCurried(3)

    println(double(5)) // 10
    println(tripple(5)) // 15
  }

}