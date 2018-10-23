object ForApp {
  def main(args:Array[String]): Unit ={
    // for(ジェネレータ処理)
    // for(変数 <- データの集合)
    // for( i <- 0 to 3) println(i)

    // for の中に for書ける
    // for の中に if書ける
    for( i <- 0 to 3 ; j <- 0 to 3 if i != j ) println(s" $i , $j")

    println("---------------")
    // ★結果を格納する
    val result = for( i <- 0 to 3 ; j <- 0 to 3 if i != j ) yield  s" $i , $j"
    for ( el <- result) println(el)
  }
}
