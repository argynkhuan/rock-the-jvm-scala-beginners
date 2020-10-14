package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  // vals are immutable

  // compiler can infer types

  val hello: String = "hello"
  val goodbye: String = "goodbye"
  val b: Boolean = true
  val c: Char = 'a'
  val y: Int = x
  val s: Short = 4200
  val l: Long = 420000000000L
  val f: Float = 2.0f
  val d: Double = 42.5


  //  variables

  var variable: Int = 4

  variable = 5 // side effects

  // vars are mutable
}
