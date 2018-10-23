object IfApp {
  def main(args:Array[String]): Unit ={

    // if
    var score = 85;
    if(score > 80) println("Create!");
    else if(score > 60) println("Good!");
    else println("SoSo");

    score = 70;
    // ★Scala 独自 ifの結果を入れられる
    val result =
    if(score > 80) "Create!"
    else if(score > 60) "Good!"
    else "SoSo"
    println(result);

  }
}
