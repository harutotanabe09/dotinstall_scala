
object ExtendApp {

  // User -> AdminUser 継承させる
  class Users(val name: String) {
    def sayHi() = println("sayHi" + name);
  }

  class AdminUser(name : String, val age :Int) extends Users(name : String){
    def sayHello() = println("sayHi" + name + "age" + age);
    override def sayHi() = println("[Admin] sayHi" + name); // オーバーライド
  }

  def main(args:Array[String]): Unit ={
    val bob  = new AdminUser("bob" , 23) // インスタンス
    println(bob.name)
    println(bob.age)
    bob.sayHi()
    bob.sayHello()
  }
}
