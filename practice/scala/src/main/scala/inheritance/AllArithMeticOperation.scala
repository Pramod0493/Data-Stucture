package inheritance

class AllArithMeticOperation(x:Int,y:Int) extends  ArithmeticOperation (x,y){

  def min():Int = a min b
  def max():Int = a max b
}

object RunAllArithOps {

  def main(args: Array[String]): Unit = {

    val obj = new AllArithMeticOperation(10, 20)
    println(obj.max())
    println(obj.min())
  }
}