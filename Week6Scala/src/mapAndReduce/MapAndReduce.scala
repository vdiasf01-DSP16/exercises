package mapAndReduce

import com.atomicscala.AtomicTest

object TestMapAndReduce extends App {
  var v = Vector(1, 2, 3, 4) 
  v.map(n => n + 1) 

  v = Vector(1, 2, 3, 4) 
  AtomicTest.any2Atomic(v.map(n => 10 * ( n + 1 ) + n )).is(Vector(21, 32, 43, 54))
  
}