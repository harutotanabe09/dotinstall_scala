object CalcApp {
  def main(args:Array[String]): Unit ={

    // 数字
    val x = 10;
    println( x / 3); // Ans 3
    println( x / 3.0); // Ans 3.3333
    println( x % 1);   // Ans 1

    var y = 5;
    y += 20;
    println(y);

    // 論理値
    var flag = true;
    println(!flag);
  }
}
