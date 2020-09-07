package scala.examples.basics

import scala.io.StdIn.readLine

object inputOutput {
  def main(args:Array[String]): Unit = {
    var numberGuess =0

    def input(): Unit = {
      do {
        print("Guess a number")
        numberGuess = readLine.toInt
      } while(numberGuess!=15)

      printf("You guessed it right %d \n", 15)
    }

    def output(): Unit = {
      val name="Siva"
      val age=32
      val weight = 180.2334

      println(s"Hello $name")

      println(f"my age is ${age+1} and ${weight}%.2f")

    }

    input
    output

  }


}
