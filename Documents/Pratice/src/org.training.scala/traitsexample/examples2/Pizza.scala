package org.training.scala.traitsexample.examples2

/**
 * Created by hduser on 21/7/16.
 */

trait  PizzaTrait {
  var numToppings: Int
  var size: Int
  val maxNumToppints = 10
}
class Pizza extends PizzaTrait{

  var numToppings = 5
  var size = 10
  override val maxNumToppints = 12


}
