// アクセス修飾子
// (public)
// private
// protected

class User {
  // val name = "user"
  // private val name = "user" NG
  protected val name = "user" // OK
  def sayHi() = println("hi! " + name)
}

class AdminUser extends User {
  override def sayHi() = println("[admin] hi! " + name)
}

object AccessApp {

  def main(args: Array[String]): Unit = {
    val user = new User
    val adminUser = new AdminUser
    // println(user.name)
    user.sayHi()
    adminUser.sayHi()
  }

}