package classargs

import com.atomicscala.AtomicTest

object TestArgs extends App {
  
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  AtomicTest.any2Atomic(family1.familySize()).is(4)
  
  val family2 = new Family("Dad", "Mom", "Harry")
  AtomicTest.any2Atomic(family2.familySize()).is(3)
  
  AtomicTest.any2Atomic(family1.squareThem(2)).is(4)
  AtomicTest.any2Atomic(family1.squareThem(2, 4)).is(20)
  AtomicTest.any2Atomic(family1.squareThem(1, 2, 4)).is(21)
  
}

class Family (mum: String, dad: String, kids: String*) {
  def familySize() : Integer = {
    var count = 2 // mum and dad
    for(x <- kids) {
      count += 1
    }
    return count
  }
  
  def squareThem(num: Int*) : Integer = { 
    var result = 0
    for( int <- num ) result += (int * int)
    return result
  }
  
}