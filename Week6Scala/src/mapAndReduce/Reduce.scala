package mapAndReduce

import com.atomicscala.AtomicTest

class Reduce() {
  def sumIt(list: Int*) : Int = {
    var result = 0
    for(value <- list ) {
      result += value
    }
    return result
  }
}

// Q28 & 29
object testReduce extends App {
  var r = new Reduce()
  AtomicTest.any2Atomic(r.sumIt(1,2,3)).is(6)
  AtomicTest.any2Atomic(r.sumIt(45,45,45,60)).is(195)
}