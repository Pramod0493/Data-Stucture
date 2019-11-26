package org.training.scala.traitsexample.examples1

trait Animal {
	val name: String
	def words: String = ""
	def say = println("%s: %s".format(name, words))
  //def say = s"$name, $words"
}

trait Endothermy
trait Hypotermy

trait Mammal extends Animal with Endothermy

class Dog extends Mammal {
	val name = "Bethoven"
	override val words = "Haw-Haw"
}

class Cat extends Mammal {
	val name = "Pixel"
	override val words = "Meow!"
	override def say = {
		print("Cat: ")
		super.say
	}
}

object AnimalTesting {
	def main(args: Array[String]) {

		val d = new Dog()
		val c = new Cat()

		d.say
		c.say

	}
}


/*
Davids-MacBook-Pro:Chapter10Traits davidtan$ scala 07.scala
Bethoven: Haw-Haw
Cat: Pixel: Meow!
 */