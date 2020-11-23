package exercises

abstract class MyList {
  /*

    head = first element of the list
    tail = remainder of the list
    isEmpty = is this list empty
    add(int) => new list with this element added
    toString => a string representation of the list

   */

  def head: Int

  def tail: MyList

  def isEmpty: Boolean

  def add(element: Int): MyList
}

object Empty extends MyList {

  def head: Int = throw new NoSuchElementException

  def tail: MyList = throw new NoSuchElementException

  def isEmpty: Boolean = true

  def add(element: Int): MyList = new Cons(element, Empty)
}

class Cons(h: Int, t: MyList) extends MyList {
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)
}

object ListTest extends App {
  val list = new Cons(1, Empty)
  println(list.head)
}
