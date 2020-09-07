package scala.examples.basics

object breakAndContinue {

  def main(args:Array[String]): Unit = {
    var i=0

    def printPrimes(): Unit = {
      val primeList = List(1,2,3,5,7,11,13)

      for(i<-primeList) {
        if(i==11)
          return  // break

        if(i!=1)
          println(i)
      }
    }

    printPrimes // otherwise the function inside main will not run

  }

}
