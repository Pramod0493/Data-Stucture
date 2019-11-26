package org.training.scala.abstractexamples

/**
 * Created by hduser on 29/7/16.
 */

abstract class X02 {
  println("Calling constructor in class X" + " name: " + name)
  val name: String
  val size = name.size
}

class Y02 extends {
   val name = {println("inside Y02"); "class Y"}

} with X02

object absexample02 {

  def main(args: Array[String]) {

    val y = new Y02
  }
}
