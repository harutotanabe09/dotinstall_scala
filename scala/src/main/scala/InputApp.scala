object InputApp {
  def main(args:Array[String]): Unit ={

    // 数字
    val name = "taguchi";
    val score = 80;

    println(s"s name : $name , score : $score");

    println(s"s name : $name , score : ${score + 10}");

    println(f"f name : $name%s , score : $score%10d");

    println(f"f name : $name%10s , score : $score%-10d");

  }
}
