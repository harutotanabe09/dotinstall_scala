object MatchApp {
  def main(args:Array[String]): Unit ={

    val signal = "red";
    val result = signal match {
      case "red" => "stop"
      case "blue" | "green" => "go"
      case "yellow" => "caution"
      case "_" => "wrong signal" // Other
    }
    println(result);

  }
}
