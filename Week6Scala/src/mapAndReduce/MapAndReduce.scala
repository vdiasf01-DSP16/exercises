package mapAndReduce

import com.atomicscala.AtomicTest

object TestMapAndReduce extends App {
  var v = Vector(1, 2, 3, 4) 
  v.map(n => n + 1) 

  v = Vector(1, 2, 3, 4) 
  AtomicTest.any2Atomic(v.map(n => 10 * ( n + 1 ) + n )).is(Vector(21, 32, 43, 54))
  
//  v = Vector(1, 2, 3, 4) 
//   foreach does not work as map do because it does not return the result
//  AtomicTest.any2Atomic(v.foreach(n => 10 * ( n + 1 ) + n )).is(Vector(21, 32, 43, 54))
  
  // This is clearly more complicated than using map, with greater potential for
  // errors, needing an independent index counter and updating each element of the
  // vector.. not nice!
  v = Vector(1, 2, 3, 4) 
  var index = 0
  for(n <- v) { 
    v = v updated (index, (10 * ( n + 1 ) + n))
    index += 1
  }
  AtomicTest.any2Atomic(v).is(Vector(21, 32, 43, 54))
  
}