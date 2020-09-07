package scala.examples.basics

object ForLoop {

  def main(args:Array[String]): Unit = {
    var i=0

    println("1. type 1 range of number")
    for(i <- 1 to 10)
      println(i)

    println("2. iterate through string")
    val randLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i <- 0 until randLetters.length)
      println(randLetters(i))

    println("3. iterate through list")
    val aList = List(1,2,3,4,5)
    for(i<-aList)
      println("List of items" + i)

    println("4. create list  using for block")
    val eventList = for{i <- 1 to 20
      if(i%2)==0
    } yield i

    for(i<-eventList)
      println(i)

    println("5. two loops in one")
    for(i <- 1 to 5; j <- 6 to 10)
      println("i:" + i +"j:" + j)

  }

}
