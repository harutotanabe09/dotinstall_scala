object FinalApp {

  // final
  // - class: 継承できない
  // - members: overrideできない

  class User {
    //final class User { NG 継承できない
    val name = "user"

    // final val name = "user" NG
    def sayHi() = println("hi! " + name)
  }

  class AdminUser extends User {
    override val name = "admin user"

    override def sayHi() = println("[admin] hi! " + name)
  }

  def main(args: Array[String]): Unit = {
    val user = new User
    val adminUser = new AdminUser
    println(adminUser.name)
  }
}

