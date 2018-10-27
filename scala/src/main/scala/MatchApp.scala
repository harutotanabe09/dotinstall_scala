object MatchApp {
  def main(args:Array[String]): Unit ={

    val signal = "red";
    // ★結果を格納
    val result = signal match {
      case "red" => "stop"
      // ★CASEの中にORが書ける
      case "blue" | "green" => "go"
      case "yellow" => "caution"
      case "_" => "wrong signal" // Other
    }
    println(result);

  }
}
