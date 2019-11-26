package org.training.scala.abstractexamples

/**
  * Created by sumanth on 1/26/2019.
  */
class Test {
  val a = 10
  def func1() = println("parent")
}

class Test1 extends Test {
  override val a = 20
  override def func1() = println("test1")
}
