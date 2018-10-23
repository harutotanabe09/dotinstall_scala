object ArgsApp {

  // 引数：デフォルト設定できる
  def sayHi(name: String = "taguchi", age:Int = 23 ): Unit = {
    println(s"hi! $name age : $age")
  }

  def main(args:Array[String]): Unit ={
    sayHi("bob", 35) // 引数
    sayHi("tom", 40)
    sayHi()
    sayHi(age = 90 , name = "kafu") // 指定した引数にインプットできる
  }
}
