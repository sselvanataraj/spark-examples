package scala.examples.basics

object maps {

  def main(args:Array[String]): Unit = {

    val emp = Map("Manager" ->"Bob Smith","Sec" ->"R Smith")

    if(emp.contains("Manager"))
      printf("Manager: %s\n ", emp("Manager") )


    /** Mutable **/
    val customers = collection.mutable.Map(1000 -> "adfaf",2000->"adfwb")
    println(customers(1000))

    customers(1000) = "Tom Marks"
    customers(200)  = "dfaret"

    for((k,v) <- customers)
      println(k, v)

  }

}
