package scala.examples.basics

object methodsHandson {

  def main(args:Array[String]): Unit = {

   /** 1. **/
    def getSum(num1:Int=1, num2:Int=1):Int = {
      return num1+num2;
    }

    println(getSum(5,4))
    println(getSum(num2=3,num1=2))

    /** 2. **/
    def sayHi():Unit = {
      println("How are you")
    }

    sayHi

    /** 3. Multiple arguments**/
    def variableArgs(args: Int*) = {
      var sum:Int =0;

      for(num <-args) {
        sum+=num;
      }

      sum
    }

    println("Get Sum " + variableArgs(1,2,3,4,5,6,7,7))
  }

}
