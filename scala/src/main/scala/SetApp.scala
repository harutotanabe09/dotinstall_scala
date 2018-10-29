object SetApp {

  def main(args: Array[String]): Unit = {
    // Collection
    // - Seq: List
    // - Set　重複は削除
    // - Map

    // val answers = Set(5, 3, 8, 5)
    // println(answers) // 5, 3, 8
    // // println(answers.contains(3)) // true
    // println(answers(3)) // true

    val set1 = Set(1, 3, 5, 8) // 重複は削除
    val set2 = Set(3, 5, 8, 9)

    println(set1 & set2) // intersect
    println(set1 | set2) // union
    println(set1 &~ set2) // diff
  }

}