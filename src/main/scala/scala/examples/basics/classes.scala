package scala.examples.basics

object classes {

  def main(args:Array[String]): Unit = {

    val rover = new Animal()
    rover.setName("Rover")
    rover.setSound("Woof")
    println(s"${rover.getName()}")

    val whiskers = new Animal("Wishkers","Meow")
    println(s"${whiskers.getName()}")

    val spike = new Dog("Spike","Woof","grrr")
    spike.setName("Spike1")
    println(spike.toString())


  }

  class Animal(var name: String,var sound:String) {
    this.setName(name)

    val id = Animal.newIdNum

    def getName() : String  = name
    def getSound() : String = sound
    def setName(name:String):Unit = {
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound:String):Unit = {
      this.sound = sound
    }

    def this(name:String) {
      this("No Name","No Sound")
      this.setName(name)
    }

    def this() {
      this("No Name","No Sound")
    }

    override def toString(): String = {
      return "%s  with id %d says %s".format(this.name, this.id,this.sound)
    }

  }

  /** Companion object **/
  object Animal {
    private var idNumber =0
    private var newIdNum = {idNumber + 1; idNumber}
  }


  /** inheritence **/
  class Dog(name:String, sound:String, growl:String) extends Animal(name,sound) {
    def this(name:String, sound:String) {
      this("No Name", sound,"No Growl")
      this.setName(name)
    }

    def this(name:String) {
      this(name, "No Name","No Growl")
      this.setName(name)
    }


    override def toString(): String = {
      return "%s  with id %d says %s".format(this.name, this.id,this.growl)
    }
  }

}
