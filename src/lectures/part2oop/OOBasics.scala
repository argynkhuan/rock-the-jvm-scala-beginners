package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 23)
  println(person.x)
  person.greet("Argyn")
  person.greek()
}


// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println("Person class init...")

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greek() = println(s"Hi, I am $name")

  // multiple constructors
}

// class parameters are NOT FIELDS