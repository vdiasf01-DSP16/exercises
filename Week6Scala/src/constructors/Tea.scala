package constructors

import com.atomicscala.AtomicTest

class Tea(
    sugar : Boolean = false, 
    milk : Boolean = false, 
    decaf : Boolean = false, 
    var name : String = "Earl Grey") 
    {
  def describe : String = { 
    if ( decaf ) name += " decaf"
    if ( milk ) name += " + milk"
    if ( sugar ) name += " + sugar"
    return name
  }
  def calories : Int = {
    var calories = 0
    if ( sugar ) calories += 16
    if ( milk ) calories += 100
    return calories
  }
}

object TeaScript extends App {
  val tea = new Tea
  AtomicTest.any2Atomic(tea.describe).is("Earl Grey")
  AtomicTest.any2Atomic(tea.calories).is(0)
  
  val lemonZinger = new Tea(
      decaf = true, 
      name="Lemon Zinger"
      ) 
  AtomicTest.any2Atomic(lemonZinger.describe).is("Lemon Zinger decaf")
  AtomicTest.any2Atomic(lemonZinger.calories).is(0)
  
  val sweetGreen = new Tea( 
      name="Jasmine Green", 
      sugar=true
      ) 
  AtomicTest.any2Atomic(sweetGreen.describe).is("Jasmine Green + sugar")
  AtomicTest.any2Atomic(sweetGreen.calories).is(16)

  val teaLatte = new Tea(sugar=true, milk=true) 
  AtomicTest.any2Atomic(teaLatte.describe).is("Earl Grey + milk + sugar")
  AtomicTest.any2Atomic(teaLatte.calories).is(116)
}