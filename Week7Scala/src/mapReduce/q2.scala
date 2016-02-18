package mapReduce

import com.atomicscala.AtomicTest

object q2 extends App {
  val v = Vector(1, 2, 3, 4)
  
  AtomicTest.any2Atomic(v.map( n => n + 1 )).is(Vector(2, 3, 4, 5))

  // For.. more complicated and prone to errors..
  var newVector = v
  var index = 0
  for(n <- v) { 
    newVector = newVector updated (index, n + 1 )
    index += 1
  }

  AtomicTest.any2Atomic(newVector).is(Vector(2, 3, 4, 5))
}