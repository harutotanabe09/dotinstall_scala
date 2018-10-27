// package はかっこでくくってもOK。Javaのようにディレクトリ意識する必要ない
package com.dotinstall.model

class User(val name: String) {
  def sayHi() = println("hi! " + name)
}

class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println("hello! " + name + "(" + age + ")")
  override def sayHi() = println("[admin] hi! " + name)
}