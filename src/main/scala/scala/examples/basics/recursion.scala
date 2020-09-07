package scala.examples.basics

object recursion {

  def main(args: Array[String]): Unit = {

    def factorial(num: BigInt): BigInt = {
      if(num<=1)
        return 1
      else num * factorial(num-1)
    }

    println(factorial(5))
  }

}
