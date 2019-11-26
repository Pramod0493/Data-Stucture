package com.pramod.scala.practice.tutorialpoint

object DoWhileDemo {

  def main(args: Array[String]): Unit = {

    var n = 10;

    do {
      print("\t" + n);
      n = n + 1;
    } while (n <= 20)
  }
}
