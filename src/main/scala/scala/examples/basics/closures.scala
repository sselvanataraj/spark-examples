package scala.examples.basics

object closures {

  def main(args:Array[String]): Unit = {

    val divisor = 5
    val divisor5 = (num:Double) => num/divisor

    println("5/5 " + divisor5(5.0))
  }
}
