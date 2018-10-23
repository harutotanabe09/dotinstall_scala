object MethodApp {

  // method
  // Unit = void
  def sayHi: Unit = {
    println("Say Hi")
  }

  // method
  def sayHiReturn: String = {
    return "Say return" //  "Say return"
  }

  def main(args:Array[String]): Unit ={
    sayHi
    println(sayHiReturn)
  }
}
