package lectures.part1basics

object DefaultArgs extends App {

  @scala.annotation.tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg",  width: Int = 1920, height: Int = 1080): Unit = println("save picture")

  /*
    1. pass in every leading argument
    2. name the arguments
  */

  savePicture("bmp")
  savePicture(width = 800)

  savePicture(width = 800, height = 1200, format = "png")
}
