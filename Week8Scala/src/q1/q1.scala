package q1

import com.atomicscala.AtomicTest

sealed trait LinkedList[T] {
  def length : Int
}

final case class End() extends LinkedList[Any] {
  override val length = 0
}
final case class Pair(head: Int, tail: LinkedList[Any]) extends LinkedList[Any] {
  override def length = {
    tail match {
      case End() => 1
      case _ => 1 + tail.length
    }
  }
}


object TestMain extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  AtomicTest.any2Atomic(example.length).is(3)
  AtomicTest.any2Atomic(example.tail.length).is(2)
  AtomicTest.any2Atomic(End().length).is(0)
}
