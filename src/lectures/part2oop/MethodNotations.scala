package lectures.part2oop


object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person) = s"${this.name} is hanging with ${person.name}"
    def unary_! : String = s"$name, hello !"
    def isAlive : Boolean = true

    def apply(): String = s"Hi, my name is $name, and I like $favoriteMovie"
  }


  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // all operators are methods
  // Akka actors have ! ?

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent


  /*

      1. Overload the + operator
         mary + "the rockstar" => new Person "Mary (the rockstar)"

      2. Add an age to the Person class
         Add an unary + operator => new person with the age + 1
         +mary => mary with the age incrementer

      3. Add a "learns" method in the Person class => "Mary learns Scala"
         Add a learnsScala method, calls learns method with "Scala".
         Use it in postfix notation.

      4. Overload the apply method
         mary.apply(2) => "Mary watched Inception 2 times"

   */
}