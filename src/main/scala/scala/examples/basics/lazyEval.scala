package scala.examples.basics

/**
  * Opposite of lazy is eager
  */
object lazyEval {


  def main(args:Array[String]): Unit = {

    println("instantiate lazy object")
    val lazyObject = new Lazy()
    println("instantiate eager object")
    val eagerObject = new Eager()

    println("---------------------")

    println("accessing lazy object")
    println(lazyObject.e)
    println("accessing lazy object again")
    println(lazyObject.e)

    println("---------------------")

    println("accessing eager object")
    println(eagerObject.e)

  }

  class Eager {
     val e = {
       println("evaluating")
       9 // return
     }
  }

  class Lazy {
    lazy val e = {
      println("evaluating")
      9 // return
    }
  }


}
