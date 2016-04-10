package lectureCode

sealed trait A {
  def foo: String = "It's an A!"
}

final case class B() extends A {
  override def foo: String = "It's an B"
}

final case class C() extends A {
  override def foo: String = "It's a C"
}

object TestMyPoly extends App {
  val anA : A = B()
  println(anA.foo)
  val anotherA = C()
  println(anotherA)
}