package caseClasses

import com.atomicscala.AtomicTest

case class Person(names: String*) {
  var n = names
  def first() : String = { n.toList(0) }
  def last()  : String = { n.toList(1) }
  def email() : String = { n.toList(2) }
}



object caseClasses extends App {
  val p = Person("Jane", "Smile", "jane@smile.com")
  AtomicTest.any2Atomic(p.first).is("Jane")
  AtomicTest.any2Atomic(p.last).is("Smile")
  AtomicTest.any2Atomic(p.email).is("jane@smile.com")
}