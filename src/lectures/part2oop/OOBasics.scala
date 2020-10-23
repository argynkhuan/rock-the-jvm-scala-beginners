package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 23)
  println(person.x)
  person.greet("Argyn")
  person.greek()
}


// constructor
class Person(name: String, val age: Int = 0) {
  // body
  val x = 2

  println("Person class init...")

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greek() = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this (name, 0)
  def this() = this("Argyn Khuan")

}

// class parameters are NOT FIELDS