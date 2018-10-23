object WhileApp {
  def main(args:Array[String]): Unit ={

    var i = 0;

    // 前判定
    while(i < 10){
      println(i)
      i += 1 // i++の記法はない
    }
    // 後判定
    var l = 100;
    do{
      println(l)
      l += 1
    }while( l < 110)
  }
}
