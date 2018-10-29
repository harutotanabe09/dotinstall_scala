// // trait
//
// trait Printable {
//   def print() = println("now printing ...")
//   def getInfo() = println("Print!")
// }
//
// trait Sharable {
//   def share() = println("now sharing ...")
//   def getInfo() = println("Share!")
// }
//
// class User extends Printable with Sharable {
//   override def getInfo() = super[Printable].getInfo()
// }

// trait

//　★traitで同じメソッドを継承するには
//  1.superで使い分ける
//  2.superで使い分ける
object TraitUpApp {

  trait Common {
    def getInfo()
  }

  trait Printable extends Common {
    def print() = println("now printing ...")
    override def getInfo() = println("Print!")
  }

  trait Sharable extends Common {
    def share() = println("now sharing ...")
    override def getInfo() = println("Share!") // overrideで後から上書き、同じtrait継承する必要あり
  }

  class User extends Printable with Sharable

  def main(args: Array[String]): Unit = {
    val user = new User
    user.getInfo()
  }

}