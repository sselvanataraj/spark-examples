package scala.examples.basics

import scala.math._
object higherOrderFunctions {


  def main(args:Array[String]): Unit = {
    val log10Func = log10 _

    println(log10Func(1000))


    List(1000.0, 2000.0).map(log10Func).foreach(println)

    List(1,2,3,4,5,6).map((x:Int)=> x*50).foreach(println)

    List(1,2,3,4,5,6,7).filter(_%2==0).foreach(println)

    def times3(num:Int) = num*3
    def times4(num:Int) =num*4

    def multIt(func: (Int) => Double, num:Int) = {
      func(num)
    }

    println("Higher order function " + multIt(times3,3))
  }

}
