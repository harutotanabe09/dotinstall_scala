// ★型パラメータ 型の変数をType＝Tを使う ジェネリックのような

// class MyInt {
//   def getThree(i: Int): Unit = println(s"$i $i $i")
// }

// Tを指定する。メソッドの呼び出し先で型宣言
class MyData[T] {
  def getThree(i: T): Unit = println(s"$i $i $i")
}

object ParamApp {

  def main(args: Array[String]): Unit = {
    // val mi = new MyInt
    // mi.getThree(3)

    val i = new MyData[Int]
    i.getThree(5)
    val s = new MyData[String]
    s.getThree("hello")
  }

}