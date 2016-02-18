package mapReduce

import scala.Vector
import com.atomicscala.AtomicTest


object testAnswers extends App {
  val v = Vector(1, 2, 3, 4)
  AtomicTest.any2Atomic(v.map(n => n + 1)).is(Vector(2, 3, 4, 5))
  AtomicTest.any2Atomic(v.map(n => ( n + 1 ) * 10 + n)).is(Vector(21, 32, 43, 54))
}

