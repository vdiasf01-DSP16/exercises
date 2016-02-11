package q6to10

import com.atomicscala.AtomicTest

class Planet(name: String, description : String, moons: Int) {
  def hasMoon() : Boolean = {
    if ( moons != 0 ) return true
    return false
  }
}

object test8 extends App {
  val p = new Planet(name = "Mercury",
    description = "small and hot planet",
    moons = 0)
  
  AtomicTest.any2Atomic(p.hasMoon).is(false)  
}