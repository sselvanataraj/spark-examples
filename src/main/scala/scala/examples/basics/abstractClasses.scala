package scala.examples.basics

object abstractClasses {

  def main(args:Array[String]): Unit = {

    val fang = new Wolf("Fang")
    println(fang.move)

  }

  abstract class Mammal(name: String)  {
    var moveSpeed: Double
    def move : String
  }

  class Wolf(name: String) extends Mammal(name) {

    var moveSpeed = 25

    def move = "wolf moving at speed " + moveSpeed

  }

}
