package caseClasses

import com.atomicscala.AtomicTest

case class Person(var first : String, var last: String, var email: String) {
//  def first() : String { return first }
//  def last()  : String = { last }
//  def email() : String = { email }
}



object caseClasses extends App {
//  val p = Person("Jane", "Smile", "jane@smile.com")
//  AtomicTest.any2Atomic(p.first).is("Jane")
//  AtomicTest.any2Atomic(p.last).is("Smile")
//  AtomicTest.any2Atomic(p.email).is("jane@smile.com")

  val people = Vector( 
      Person("Jane","Smile","jane@smile.com"), 
      Person("Ron","House","ron@house.com"), 
      Person("Sally","Dove","sally@dove.com")
      )

      AtomicTest.any2Atomic(people(0)).is("Person(Jane,Smile,jane@smile.com)")
      AtomicTest.any2Atomic(people(1)).is("Person(Ron,House,ron@house.com)")
      AtomicTest.any2Atomic(people(2)).is("Person(Sally,Dove,sally@dove.com)")
}