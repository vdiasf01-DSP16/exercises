package dogYears

import com.atomicscala.AtomicTest

object TestDogYears extends App {
  val dogYears = (x: Int) => x * 7
  AtomicTest.any2Atomic(dogYears(10)).is(70)
}