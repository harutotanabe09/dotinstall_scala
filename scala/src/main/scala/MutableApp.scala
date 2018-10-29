// import scala.collection.mutable.Map
import scala.collection.mutable.{ Map => MutableMap }

object MutableApp {

  def main(args: Array[String]): Unit = {
    // Collection
    // - Seq: List
    // - Set
    // - Map

    // Immutable　（変更不可）
    // val scores = Map("taguchi" -> 40, "fkoji" -> 80)
    // val scores2 = scores.updated("taguchi", 60) マップを再度扱う場合別の関数で返す

    // ★Mutable：変更可能なCollectionを作成可能
    val scores = MutableMap("taguchi" -> 40, "fkoji" -> 80)
    scores("taguchi") = 60

  }
}