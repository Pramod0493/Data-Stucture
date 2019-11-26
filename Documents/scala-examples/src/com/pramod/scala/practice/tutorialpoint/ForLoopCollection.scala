package com.pramod.scala.practice.tutorialpoint

object ForLoopCollection {

  def main(args: Array[String]): Unit = {

    var a:Int=0;
    val myList=List(1,2,3,4,5,6,7,8,9,10)

    for (a <-myList ){
      println(a)
    }
  }
}
