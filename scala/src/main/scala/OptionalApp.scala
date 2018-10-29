object OptionalApp {

  def main(args: Array[String]): Unit = {
    // Error
    // Option
    // - Some
    // - None

    val scores = Map("taguchi" -> 50, "fkoji" -> 80)
    // println(scores("dotinstall")) // getOrElse, contains

    // scores.get("dotinstall") match {
    scores.get("fkoji") match {
      case Some(v) => println(v)
      case None => println("key not found")
    }

  }

}