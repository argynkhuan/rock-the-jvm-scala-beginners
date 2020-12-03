package lectures.part2oop

object Generics extends App {
  class MyList[A] {
    // use the type A
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. Yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantClass[+A]

  val animal: Animal = new Cat
  val animalList: CovariantClass[Animal] = new CovariantClass[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION.


  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! CONTRA VARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  val newCage = new Cage(new Car)
}
