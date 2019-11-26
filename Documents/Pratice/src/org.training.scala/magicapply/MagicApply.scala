package org.training.scala.magicapply

/**
  * Created by Arjun on 11/1/2016.
  */

class Foo(var x:Int) {
  def apply(y:Int) = x + 10
  def apply(y1:Int, z:Int) = x + y1 + z
}

object MagicApply extends App {
 val l = List(1,2,3)
  val foo = new Foo(10)
  println(foo.apply(20))
  println(foo(20))
  println(foo(20, 30))

}
