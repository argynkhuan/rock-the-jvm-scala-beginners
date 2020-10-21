package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue (x: Long): Unit = {
    println("by value: " + x) // x
    println("by value: " + x) // x
  }

  def calledByName (x: => Long): Unit = {
    println("by name: " + x) // System.nanoTime()
    println("by name: " + x) // System.nanoTime()
  }


  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//printFirst(infinite(), 34)
  printFirst(32, infinite())
}
