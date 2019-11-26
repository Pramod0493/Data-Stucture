package com.pramod.scala.practice.tutorialpoint

object ForLoopDemo {

  def main(args: Array[String]): Unit = {

    var n=10;

   /* for( a <- 1 to n){
      println(a)
    }*/

    for(n <- 1 until 20){
      println(""+n)
    }
  }

}
