package com.pramod.scala.practice.tutorialpoint

object Function1 {

  def main(args: Array[String]): Unit = {
    print(addition(10,20))
  }

  def addition(x:Int,y:Int): Unit = {
    val sum=x+y;
    println("Welcome to Function")
    println("Sum is:"+sum)
  }
}
