object PartsApp {

  // ★部分適用：作った関数をさらに別の関数として作成する

  def msg(from: String, to: String, text: String) = s"($from -> $to): $text"

  def main(args: Array[String]): Unit = {
    // println(msg("taguchi", "fkoji", "OK!"))
    // println(msg("sugita", "fkoji", "Great!"))
    // println(msg("tanaka", "fkoji", "Good!"))

    // 引数の２番目は共通という関数を作成する。 _ はプレースホルダ
    val msgToFkoji = msg(_: String, "fkoji", _: String)
    // val msgToFkoji = msg(_: String, _: String, _: String)　下と同じ結果。特殊な書き方ができる
    val msgFunc = msg _

    println(msgToFkoji("taguchi", "OK!"))
    println(msgToFkoji("sugita", "Great!"))
    println(msgToFkoji("tanaka", "Good!"))
  }

}