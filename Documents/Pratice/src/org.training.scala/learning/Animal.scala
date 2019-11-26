package org.training.scala.learning

import scala.math.Numeric.DoubleIsFractional

trait Animal {

  val animal_name :String
  def speak(): String

  //super is refering to subtype of AnyRef
  override def toString: String = {
    s"I am a animal with same $animal_name and I sound $speak()"
  }
}

abstract  class PetAnimal{
  val animal_name :String
  val animal_type : String ="pet"
  def eat() = println("Assume I eat veg Food")

  override def toString: String = {
    s"I am a animal with same $animal_name and I sound $eat()"

  }

}

class Dog extends PetAnimal with Animal {
  def speak():String ="bow ..bow..bow"
  val animal_name="dog"
}

object  RunAnimalExample{
  def main(args: Array[String]): Unit = {
    val d=new Dog
    println(d)
  }
}