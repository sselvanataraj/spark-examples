package scala.examples.basics

object traits {

  def main(args:Array[String]): Unit = {

    val superman = new SuperHero("Clark")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(10.2))
  }

  trait Flyable {
    def fly:String
  }

  trait BulletProof {
    def hitByBullet: String
    def ricochet(startSpeed:Double):String = {
        "bullet speed get reduced to  1.0"
    }
  }

  class SuperHero(name:String) extends Flyable with BulletProof {
    def fly = "fly through air " + name

    override def hitByBullet: String = "hit by bullet " + name
  }
}
