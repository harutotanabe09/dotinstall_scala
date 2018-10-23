object VarApp {
  def main(args:Array[String]): Unit ={
    // var :値の再入OK
    val msg : String = "Hello World"
    // msg = "Hello World Again" NG
    println(msg);

    // val :値の再入NG
    var msg2 : String = "Hello World"
    msg2 = "Hello World Again"
    println(msg2);
  }
}
