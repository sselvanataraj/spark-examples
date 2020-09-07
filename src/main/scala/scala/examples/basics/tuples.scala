package scala.examples.basics

object tuples {
  def main(args:Array[String]): Unit = {
    var tupleMarge = (103, "Marge", 10.25)

    println(tupleMarge._2)
    println(tupleMarge._1)
    println(tupleMarge._3)

    /** product iterator **/
    tupleMarge.productIterator.foreach{ i => println(i)}

    /** convert tuple to string **/

    println(tupleMarge.toString())
  }
}
