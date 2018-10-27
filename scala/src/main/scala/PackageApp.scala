// Package

//import com.dotinstall.model.User
import com.dotinstall.model.AdminUser
// import com.dotinstall.model.{User, AdminUser}
// import com.dotinstall.model._

object PackageApp {

  def main(args: Array[String]): Unit = {
    // val tom = new com.dotinstall.model.User("tom")
    //val tom = new User("tom")
    val bob = new AdminUser("bob", 23)
    bob.sayHello()
    bob.sayHi()
  }

}