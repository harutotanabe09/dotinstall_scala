

object TraitApp {
  // ★trait Javaのインターフェイス

  trait Printable {
    def print() = println("now printing ...")
  }

  trait Sharable {
    def share() = println("now sharing ...")
  }

  // 継承１つであれば extends
  // 継承２つであれば with
  class User extends Printable with Sharable
  // class User extends OtherClass with Printable

  def main(args: Array[String]): Unit = {
    val user = new User
    user.print()
    user.share()
  }

}