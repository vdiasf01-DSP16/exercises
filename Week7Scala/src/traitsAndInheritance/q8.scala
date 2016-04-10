package traitsAndInheritance

import com.atomicscala.AtomicTest

sealed trait LinkedList[A] {
  var head: Int
  var tail: LinkedList[A]
  def length() : Int;
  def apply(pair: Pair[A]) : Int;
  def contains(pair: Pair[A]) : Boolean
}

final case class Pair[A](h: Int, t: LinkedList[A]) extends LinkedList[A] {
  override var head = h
  override var tail = t
  override def length() = t.length + 1
  override def apply(pair: Pair[A]) = {
    pair.head match {
      case `h` => length()
      case _ => t.apply(pair)
    }
   // throw new Exception("Element not found")
  }
  override def contains(pair: Pair[A]) = {
    pair.h match {
      case `h` => true
      case _ => { 
        if ( t.equals(Empty[A]()) ) {
          false
        }
        else {
          t.contains(pair)
        }
      }
    }
  }
}

final case class Empty[A]() extends LinkedList[A] {
  override var head = 0
  override var tail : LinkedList[A] = null
  override def length() = 0
  override def apply(pair: Pair[A]) = 0//throw new Exception("Element not found")
  override def contains(pair: Pair[A]) = false
}

object testLinkedList extends App {
  
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  AtomicTest.any2Atomic(list.isInstanceOf[LinkedList[Int]]).is(true)
  AtomicTest.any2Atomic(list.head).is(1)
  AtomicTest.any2Atomic(list.tail.head).is(2)
  AtomicTest.any2Atomic(list.tail.tail).is(Pair(3, Empty()))

  AtomicTest.any2Atomic(list.length()).is(3)
  AtomicTest.any2Atomic(list.tail.length()).is(2)
  AtomicTest.any2Atomic(list.tail.tail.length()).is(1)
  AtomicTest.any2Atomic(list.tail.tail.tail.length()).is(0)

  AtomicTest.any2Atomic(list.contains(Pair(1, null))).is(true)
  AtomicTest.any2Atomic(list.contains(Pair(2, null))).is(true)
  AtomicTest.any2Atomic(list.contains(Pair(3, null))).is(true)
  AtomicTest.any2Atomic(list.contains(Pair(4, null))).is(false)

  AtomicTest.any2Atomic(list.apply(Pair(3,null))).is(1)


}