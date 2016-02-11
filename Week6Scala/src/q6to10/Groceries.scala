package q6to10

import com.atomicscala.AtomicTest

class Item(name: String, price: Double) {

  def cost(grocery: Boolean = false, 
      medication: Boolean = false, 
      rate: Double = 0.10) : Double = {
    if ( grocery || medication) {
      return price
    }
    else return price * rate + price
  }

}

object testItem extends App {
  val flour = new Item(name = "flour", 4)
  AtomicTest.any2Atomic(flour.cost(grocery=true)).is(4)
  
  val sunscreen = new Item(name = "sunscreen", 3)
  AtomicTest.any2Atomic(sunscreen.cost()).is(3.3)
  
  val tv = new Item(name = "televison", 500)
  AtomicTest.any2Atomic(tv.cost(rate = 0.06)).is(530)
  
  
}