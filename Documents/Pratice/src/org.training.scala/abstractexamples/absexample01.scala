package org.training.scala.abstractexamples

/**
 * Created by hduser on 29/7/16.
 */

abstract class X {
   println("class X is called")
  val name: String
  //val size = name.size
}

object Y extends X {
  println("object Y is called")
  val name = "Hello Scala"
}

object absexample01 {
  def main(args: Array[String]) {
    //Y
    println(Y.name)
  }

}
