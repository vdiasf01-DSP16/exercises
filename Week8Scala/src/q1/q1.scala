package q1

import com.atomicscala.AtomicTest

sealed trait LinkedList[T] {
  def length : Int
  def contains(value: T) : Boolean
}

final case class End[T]() extends LinkedList[T] {
  override val length = 0
  override def contains(value: T) = {
    value match {
      case null => true
      case _ => false
    }
  }
}

final case class Pair[T](head: Int, tail: LinkedList[T]) extends LinkedList[T] {
  override def length = {
    tail match {
      case End() => 1
      case _ => 1 + tail.length
    }
  }
  override def contains(value: Int) = {
    value match {
      case `head` => true
      case _ => { 
        tail match {
          case Pair(h,t) => t.contains(value)
          case _ => false
        }
      }
    }
  }
}

object TestMain extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  AtomicTest.any2Atomic(example.length).is(3)
  AtomicTest.any2Atomic(example.tail.length).is(2)
  AtomicTest.any2Atomic(End().length).is(0)

//  AtomicTest.any2Atomic(example.contains(3)).is(true)
//  AtomicTest.any2Atomic(example.contains(4)).is(false)
  AtomicTest.any2Atomic(End().contains(0)).is(false)
}
