package mapReduce

import com.atomicscala.AtomicTest

object q4 extends App {
  
  def sumIt(int : Int*) : Int = {
    int.reduce((sum, newI) => sum + newI )
  }
  
  AtomicTest.any2Atomic(sumIt(1, 2, 3)).is(6)
  AtomicTest.any2Atomic(sumIt(45, 45, 45, 60)).is(195)
}