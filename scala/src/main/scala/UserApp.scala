// object ★ Scala独自
// static が object っぽい
// 同名のクラスとオブジェクトが定義可能
object UserApp {
  def apply(name: String) = new startApp.User(name);
  def getInfo() = println("User Object");
}

object startApp {
  class User(val name: String) {
    def sayHi() = Predef.println("hi! " + name)
  }

  def main(args: Array[String]): Unit = {
    UserApp.getInfo()
    // val tom = new User("tom")
    // val tom = User.apply("tom")
    val tom = UserApp("tom")
    println(tom.name)
  }

}