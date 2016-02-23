package traitsAndInheritance

import com.atomicscala.AtomicTest

sealed trait LinkedList[A] {
  var head: Int
  var tail: LinkedList[A]
}

final case class Pair[A](h: Int, t: LinkedList[A]) extends LinkedList[A] {
  override var head = h
  override var tail = t
  tail match {
    case Empty() => tail
    case Pair(he,ta) => ta
  }
}

final case class Empty[A]() extends LinkedList[A] {
  override var head = 0
  override var tail : LinkedList[A] = null
}

object testLinkedList extends App {
  
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  AtomicTest.any2Atomic(list.isInstanceOf[LinkedList[Int]]).is(true)
  AtomicTest.any2Atomic(list.head).is(1)
  AtomicTest.any2Atomic(list.tail.head).is(2)
  AtomicTest.any2Atomic(list.tail.tail).is(Pair(3, Empty()))
  
}