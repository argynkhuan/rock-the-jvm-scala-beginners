package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract

  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }


  class Dog extends Animal {
    override val creatureType: String = "wild"

    def eat: Unit = println("crunch crunch")
  }

  //traits

  trait Carnivore {
    def eat(animal: Animal)
    val preferredMeal = "fresh meet"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "crocodile"

    def eat: Unit = println("nom nom nom")

    def eat(animal: Animal): Unit = println(s"I'm a crocodile, and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile

  crocodile.eat(dog)

  // traits vs abstract classes
  // 1 - traits don't have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits are behavior, abstract class is a type of thing

}
