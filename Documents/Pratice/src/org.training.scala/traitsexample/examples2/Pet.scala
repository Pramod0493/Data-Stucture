package org.training.scala.traitsexample.examples2

/**
 * Created by hduser on 21/7/16.
 */
trait Curious {

  def  start= {println("I am curious. I Jump around")}
  def stop = {println("I am not curious. I sleep")}
}

abstract class Pet(var name: String) {

  def speak
  def ownerIsHome = println("excited")
  def jumpForJoy { println("jumping for joy") }
}

class Cat(name: String) extends Pet(name) with Curious {

  def speak = println("Meow.. Meow")

  override def ownerIsHome = {
    println("Owner is home. Who cares")
    start
    stop
  }

  override def jumpForJoy {
    println("Jump with Joy and scratch everyboy")
  }
}

object PetTesing {

  def main(args: Array[String]) {
    val mistu = new Cat("Mistu")
    mistu.ownerIsHome
    mistu.jumpForJoy
  }
}