package dogYears

import com.atomicscala.AtomicTest

object TestDogYears extends App {
  val dogYears = (x: Int) => x * 7
  AtomicTest.any2Atomic(dogYears(10)).is(70)
  
  var s = "" 
  val v = Vector(1, 5, 7, 8) 
  v.foreach(x => s+=dogYears(x)+" ") 
  AtomicTest.any2Atomic(s).is("7 35 49 56 ")
  
}