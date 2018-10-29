// 抽象クラス
// User: 抽象クラス
// - Japanese: 具象クラス
// - American: 具象クラス

abstract class User {
  def sayHi()
}

class Japanese extends User {
  def sayHi() = println("こんにちは！")
}

class American extends User {
  def sayHi() = println("hi!") // 抽象クラスのメソッドを持たないといけない
}

object AbstaractApp {

  def main(args: Array[String]): Unit = {
    val aki = new Japanese
    val tom = new American
    aki.sayHi()
    tom.sayHi()
  }

}