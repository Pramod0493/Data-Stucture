package org.training.scala.abstractexamples

/**
  * Created by sumantht on 5/24/2017.
  */

abstract class Animal1 {
  //var animal_test:String = ""
  var animal_name:String
  val id:Long = -1
  def speak:String
  def printAnimalName = println("I am "+ animal_name)
}

/* Here Dog1 is setting the values for inheritied members but not overriding
   Overriding base class var's (with initial value) in child class is not possible - animal_test
   Overriding base class val's in child class is allowed - id
 */
class Dog1 extends Animal1 {
  var animal_name = "Dog"
  //override var animal_test = "Dog1"
  override val id = 101l
  def speak = { "woof....." }
}

class Cat1 extends Animal1 {
  override var animal_name = "Cat1"
  override val id = 102l
  def speak = { "meoww... meoww"}
}

object AbstractTest1_test {

  def main(args: Array[String]): Unit = {

    val d = new Dog1
    println(d.speak)
    d.printAnimalName

    val c = new Cat1
    println(c.speak)
    c.printAnimalName
  }
}
