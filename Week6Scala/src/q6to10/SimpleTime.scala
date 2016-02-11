package q6to10

import com.atomicscala.AtomicTest

class SimpleTime(var hours: Int, var minutes: Int = 0) {
  
}

object test extends App {
  val t = new SimpleTime(hours=5, minutes=30)
  AtomicTest.any2Atomic(t.hours).is(5)
  AtomicTest.any2Atomic(t.minutes).is(30)

  val t2 = new SimpleTime(hours=10)
  AtomicTest.any2Atomic(t2.hours).is(10)
  AtomicTest.any2Atomic(t2.minutes).is(0)

}