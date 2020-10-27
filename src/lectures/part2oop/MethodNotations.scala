package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangoutWith (person: Person) = s"${this.name} is hanging with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")

  val tom = new Person("Tom", "Fight Club")

  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent

  println(mary hangoutWith tom)
  // infix notation = operator notation

  // "operators" in Scala
}
