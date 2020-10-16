package lectures.part1basics

object Functions extends App {

  def functionA(a: String, b: Int): String = {
    a + " " + b
  }

  println(functionA("result: ", 3))

  def parameterlessFunction(): Int = 42

  println(parameterlessFunction())
  println(parameterlessFunction)

 def recursiveFunction (txt: String, n: Int): String = {
   if (n == 1) txt
   else txt + " " + recursiveFunction(txt, n-1)
 }

  println(recursiveFunction("rec_text", 3))

  // when you need loops, use recursion

  def functionWithSideEffects(s: String): Unit = println(s)

  functionWithSideEffects("side-text")

  def bigFuction(n: Int): Int = {
    def smallerFuntion(a: Int, b: Int): Int = a + b
    smallerFuntion(n, n-1)
  }
}
