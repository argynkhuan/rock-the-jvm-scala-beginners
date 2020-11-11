package lectures.part2oop

object InheritanceAndTraits extends App {

  // single class inheritance
  class Animal {
    val creatureType = "Wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat

  cat.crunch

  // constructors
  class Person (name: String, age : Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult (name: String, age: Int, idCard: String) extends Person(name)


  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eat: Unit = println("crunch, crunch")
  }

  val dog = new Dog("K9")

  dog.eat
  println(dog.creatureType)
  println(cat.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overriding vs overloading

}
