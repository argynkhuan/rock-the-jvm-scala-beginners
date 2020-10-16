package exercises

object FunctionExs extends App {

  def info (name: String, age: Int): Unit =
    println(s"Hi, my name is $name, and I am $age years old.")

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil (x: Int): Boolean =
      if (x <= 1) true
      else n % x != 0 && isPrimeUntil(x - 1)
    isPrimeUntil(n / 2)
  }

  // The worst thing a Scala programmer can do is use imperative code with the Scala syntax


  info ("Argyn", 22)

  println(factorial(5))

  println(fibonacci(3))

  println(isPrime(125))
}
