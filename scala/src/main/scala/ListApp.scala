object ListApp {

  def main(args: Array[String]): Unit = {
    // Collection
    // - Seq: List 順番を持つ
    // - Set　重複しない
    // - Map　キーとバリューで管理

    // val scores = List(200, 300, 400)
    // val scores = List[Int](200, 300, 400)

    // val scores = Nil // ★Nilは空のリスト
    // val scores = 200 :: Nil
    val scores = 200 :: 300 :: 400 :: Nil

    println(scores.length) // リストの個数
    println(scores.isEmpty) // リストが空か
    println(scores.head) //リストの先頭
    println(scores.tail)
    println(scores(1)) // 300

  }

}