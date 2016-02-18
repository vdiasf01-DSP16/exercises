package mapReduce

import scala.Vector
import com.atomicscala.AtomicTest


object testAnswers extends App {
  val v = Vector(1, 2, 3, 4)
  AtomicTest.any2Atomic(v.map(n => n + 1)).is(Vector(2, 3, 4, 5))
  AtomicTest.any2Atomic(v.map(n => ( n + 1 ) * 10 + n)).is(Vector(21, 32, 43, 54))

  // Foreach does not return the expected result
  AtomicTest.any2Atomic(v.foreach(n => n + 1)).is(Vector(2, 3, 4, 5))
  AtomicTest.any2Atomic(v.foreach(n => ( n + 1 ) * 10 + n)).is(Vector(21, 32, 43, 54))

  // For.. mor complicated and prone to errors..
  var newVector = v
  var index = 0
  for(n <- v) { 
    newVector = newVector updated (index, (10 * ( n + 1 ) + n))
    index += 1
  }
  AtomicTest.any2Atomic(newVector).is(Vector(21, 32, 43, 54))

}

