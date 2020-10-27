package lectures.part1basics

object Expressions extends App {
  // Expression

  val x = 1 + 2

  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var variableA = 2
  variableA += 3
  println(variableA)
  // -= *= /= ... side effects

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val condition = true
  val conditionedValue = if(condition) 5 else 3
  println(conditionedValue)
  println(if(condition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // Never write this again

  // Everything in Scala is an Expression!

  val wiredValue = (variableA = 3) // Unit === void
  println(wiredValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val codeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

}
