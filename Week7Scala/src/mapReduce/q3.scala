package mapReduce

import com.atomicscala.AtomicTest

object q3 extends App {
  
  val v = Vector(1, 10, 100, 1000)
  AtomicTest.any2Atomic(v.reduce((sum, n) => sum + n)).is(1111)
  
  var finalValue = 0
  for(n <- v) { 
    finalValue += n
  }
  
  AtomicTest.any2Atomic(finalValue).is(1111)
  


  
}