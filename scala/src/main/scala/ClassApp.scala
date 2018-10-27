object ClassApp {
  // Class
  // user : User
  // i : Int
  // - 変数　フィールド
  // - メソッド
  class User {
    val name = "my name";
    def sayHi() = println("sayHi");
  }

  def main(args:Array[String]): Unit ={
    val user  = new User // インスタンス
    //val user : User  = new User 型推論にて省力可能
    println(user.name)
    user.sayHi()
  }
}
