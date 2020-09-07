package scala.examples.basics


/**
  * Implicit conversion to solve adding a complex number to regular number.
  *
  * Implicits has to at the top
  */

object ComplexImplicits {
  implicit def Double2Complex(value: Double): Complex = new Complex(value,0.0)

  implicit def Tuple2Complex(value: Tuple2[Double,Double]) = new Complex(value._1,value._2)

}


/**
  * We are adding complex number to complex number here.
  */
object ImplicitConversions2 {

  /** https://dzone.com/articles/implicit-conversions-scala **/
  def main(args : Array[String]) : Unit = {
    var a = new Complex(4.0,5.0)
    var b = new Complex(2.0,3.0)
    println(a)  // 4.0 + 5.0i
    println(a + b)  // 6.0 + 8.0i
    println(a - b)  // 2.0 + 2.0i

    println(a + 8.5)
    /** this will not work with our overload println(8.5 + a)  **/
    import ComplexImplicits._ // we have to import the implicit to make things work
    println(7 + a)

    implicit def Tuple2Complex(value: Tuple2[Double, Double]) = new Complex(value._1,value._2)

    println()
    var c=(2.0,2.0) // intantiate the object with tuple
    var d=(3.0,3.0)
    println(c + d)
  }

}

class Complex(val real : Double, val imag : Double) {

  def +(that: Complex) =
    new Complex(this.real + that.real, this.imag + that.imag)

  /**
    *  Suppose if we want to add complex number + normal number
    *
    *  we can override but it will not work properly
    */
  def +(n: Double) = new Complex(this.real + n, this.imag)


  def -(that: Complex) =
    new Complex(this.real - that.real, this.imag - that.imag)

  override def toString = real + " + " + imag + "i"

}






