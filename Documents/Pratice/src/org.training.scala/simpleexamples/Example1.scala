package org.training.scala.simpleexamples

/**
 * Created by hduser on 9/5/16.
 */
object Example1 {


  def main(args: Array[String]) {

    val numbers = List( 1, -2, 3, -4, 5)
    val t = numbers.reduce((acc, iter) => {
      if (acc < iter) acc else iter
    })

    println(t)
  }
}

