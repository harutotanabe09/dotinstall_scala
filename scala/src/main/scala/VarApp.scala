object VarApp {
  def main(args:Array[String]): Unit ={
    // var :値の再入OK
    // val :値の再入NG
    val msg : String = "Hello World" //型推論
    // msg = "Hello World Again" NG
    println(msg);

    var msg2 : String = "Hello World" //型推論
    msg2 = "Hello World Again"
    println(msg2);
  }
}
