package scala.examples.basics

import scala.collection.mutable

object arrays {

  def main(args:Array[String]): Unit = {

    /** Arrays **/
    val favNums = new Array[Int](20)

    val friends = Array("Bob","Tom")

    friends(0)="Sue"

    /** Array Buffer **/
    val friends2 = mutable.ArrayBuffer[String]()

    friends2.insert(0,"Phil")
    friends2 += "Marks"
    friends2 ++= Array("sss","adfd")
    friends2.insert(1,"Mike","Sally","Sam","Mary")
    friends2.remove(1,2)

    var friend: String =""

    for(friend<-friends2)
      println(friend)

    for(j <- 0 to (favNums.length-1)) {
      favNums(j) = j
      println(favNums(j))
    }


    val favNums2 = for(num <-favNums) yield 2*num

    favNums2.foreach(println)

    var favnum4 = for(num<-favNums if num%4==0) yield num

    favnum4.foreach(println)


    /** Multi dimensional array **/

    var mulTable = Array.ofDim[Int](10,10)

    for(i <- 0 to 9) {
      for(j <- 0 to 9) {
        printf("%d : %d = %d \n",i,j,mulTable(i)(j))
      }
    }

    println("SUm:" + favNums.sum)
    println("Min:" + favNums.min)
    println("Max:" + favNums.max)


    val sortedNums = favNums.sortWith(_>_)

    println(sortedNums.toString)
    println(sortedNums.deep.mkString(", "))


    // hetrogenous list
    val heterogeneousList: List[Any] = List(1, "1", '1')

    // empty list
    val empty: List[Nothing] = List()

    // list of list
    val diag3: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))

  }

}
