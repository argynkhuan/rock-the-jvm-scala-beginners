package exercises.oop

class Novel(name: String,year: Int, author: Writer) {

  def this(year: Int) = this(this.name, year, this.author)

  def authorAge: Int = author.age

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(year: Int): Novel = null

}
