object ConstructApp {
  // Class
  // user : User
  // i : Int
  // - 変数　フィールド
  // - メソッド
  // class Users(_name: String) {
  class Users(val name: String) {
    //  val name = _name
    def sayHi() = println("sayHi" + name);
    //  def sayHi() = println("sayHi" + this.name); this 省力可能
  }

  def main(args:Array[String]): Unit ={
    val tom  = new Users("tom") // インスタンス
    //val user : User  = new User 型推論にて省力可能
    println(tom.name)
    tom.sayHi()
  }
}
