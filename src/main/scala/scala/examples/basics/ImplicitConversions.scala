package scala.examples.basics

object ImplicitConversions {

  def main(args:Array[String]): Unit = {
    (1 to 4).foreach(println)
    println()
    1.to(4).foreach(println)
  }


  /**
    * val a:Int = 1
    * val b:Int = 4
    * val myRange: Range = a.to(b)
    * myRange.foreach(println)
    *
    * Implicit Conversions are set of methods that scala compiler tries to apply when it sees wrong argument type being used.
    *
    * (1 to 4).foreach(println) can be written as
    * 1.to(4).foreach(println)
    *
    * in the example "to" is a method which take RichInt as parameter
    *
    * So when Scala sees 1 to 4 it first runs the implicit conversion on the 1 converting it from an Int primitive into a RichInt. It can then call the to method on the new RichInt object, passing in the second Int (4) as the parameter.
    */

}


