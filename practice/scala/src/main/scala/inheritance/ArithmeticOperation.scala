package inheritance

class ArithmeticOperation (val a:Int,val b:Int) {

    def add :Int =a+b
    def sub :Int =a-b
    def mul :Int =a*b
    def div :Int =a/b

  }

  object RunApp1{
      def main(args:Array[String]):Unit = {
        val input1 = args(0).toInt
        val input2 = args(1).toInt
        val am = new ArithmeticOperation(input1, input2)
        println(am.add)
        println(am.sub)
      }
}
