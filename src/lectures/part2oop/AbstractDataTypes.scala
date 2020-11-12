package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract

  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }


  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("crunch crunch")
  }

  //traits

  trait Carnivore {
    def eat(animal: Animal)
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "crocodile"

    override def eat: Unit = println("nom nom nom")

    override def eat(animal: Animal): Unit = println(s"I'm a crocodile, and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile

  crocodile.eat(dog)

}
