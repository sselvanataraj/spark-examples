package scala.examples.basics

object strings {

  def main(args:Array[String]): Unit = {
    var randSend = "I Saw  a  dragon fly by"

    println("3rdIndex :" + randSend(3))
    println("String length:" + randSend.length)
    println(randSend.concat(" yesterday"))
    println("I Saw a dragon fly by".equals(randSend))

    val randSendArray = randSend.toCharArray

  }

}
