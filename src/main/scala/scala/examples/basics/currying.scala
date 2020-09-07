package scala.examples.basics

/**
  *
  * A currying function is a function which could accept a fewer number of parameters than are declared,
  * then it returns a function with unused parameters
  */
object currying {




  def main(args:Array[String]): Unit = {

    // Execute higher order function
    val heyWord =  concatenator("Hello") // heyWord is a function here as concatenator returns function
    println(heyWord)
    println(heyWord("HigherOrderFunction")) // now we are passing second argument.

    // Currying
    val heyWord2 = concatenatorCurry("Hello")_ // underscore here says i have only one argument, so heyWord2 will be a function which requires one argument.
    println(heyWord2)
    println(heyWord2("Currying"))


  }


  /** This is Higher Order Function
    * This will return a function as return type.
    *
    *
    *  heyWord("Word")
    *
    *  "Hello World"
    *
  **/
  def concatenator(w1:String):String=>String = w2 => w1 + " " + w2


  /** currying function **/
  def concatenatorCurry(w1:String)(w2:String) = w1 +" "+w2

}
