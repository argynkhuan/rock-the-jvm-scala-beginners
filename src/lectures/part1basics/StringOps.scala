package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(' ', '-'))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val numberString = "45"

  val number = numberString.toInt

  println('a' +: numberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators

  // S-interpolators
  val name = "Argyn"
  val age = 22
  val greeting1 = s"Hi, my name is $name, and I'm $age old."
  val greeting2 = s"Hi, my name is $name, and I'm ${age + 1} old."
  println(greeting2)

  // F-inerpolators
  val speed = 1.5f
  val greeting3 = f"$name%s can eat $speed%2.2f burgers per minute."
  println(greeting3)

  // raw-interpolators
  println (raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
