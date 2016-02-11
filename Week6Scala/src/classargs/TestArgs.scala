package classargs

import com.atomicscala.AtomicTest

object TestArgs extends App {
  
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  AtomicTest.any2Atomic(family1.familySize()).is(4)
  
  val family2 = new Family("Dad", "Mom", "Harry")
  AtomicTest.any2Atomic(family2.familySize()).is(3)
  
  
}

class Family (names: String*) {
  def familySize() : Integer = {
    val size : Integer = names.length;
    return size
  }
  
}