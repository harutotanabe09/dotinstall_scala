object MapApp {

  def main(args: Array[String]): Unit = {
    // Collection
    // - Seq: List
    // - Set
    // - Map
    //    - key -> value

    val sales = Map("taguchi" -> 200, "fkoji" -> 400)
    println(sales("taguchi")) // 200
    // println(sales("dotinstall")) // error
    // println(sales.contains("dotinstall")) // false
    println(sales.getOrElse("dotinstall", -1)) // 値があればその値を、なければその値を返す


  }

}