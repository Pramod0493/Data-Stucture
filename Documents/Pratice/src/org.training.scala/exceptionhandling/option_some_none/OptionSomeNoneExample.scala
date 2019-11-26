package org.training.scala.exceptionhandling.option_some_none

/**
  * Created by Arjun on 11/1/2016.
  */
object OptionSomeNoneExample extends App {

  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => {
        println(e.getMessage)
        None
      }
    }
  }

  /*def toInt(in: String): Either[NumberFormatException,Int] = {
    try {
      println("test")
      Right(Integer.parseInt(in.trim))
    } catch {
      case e: NumberFormatException => Left(e)
    }
  }*/

  val someString = "100"
  toInt(someString) match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
  }

  /*val a = "test"
  a.toInt*/
  /*toInt(someString) match {
    case Right(i) => println(i)
    case Left(e) => println("That didn't work and the exception is:" + e.getMessage)
  }*/

}
