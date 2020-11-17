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

  def head: Int = ???

  def tail: MyList = ???

  def isEmpty: Boolean = ???

  def add(element: Int): MyList = ???
}

class Cons(h: Int, t: Int) extends MyList {
  override def head: Int = ???

  override def tail: MyList = ???

  override def isEmpty: Boolean = ???

  override def add(element: Int): MyList = ???
}
