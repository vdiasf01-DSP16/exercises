package traitsAndInheritance

sealed trait DivisionResult {
  def apply(numerator: Int, denominator: Int) : DivisionResult = {
    denominator match {
      case 0 => Infinite(numerator)
      case _ => Finite(numerator/denominator)
    }
  }
}

final case class Finite(num: Int) extends DivisionResult {
  override def toString() : String = num.toString()
}
final case class Infinite(num: Int) extends DivisionResult {
  override def toString() : String = {
    if ( num >= 0 ) "+Infinity"
    else "-Infinity"
  }
}

object divide {
  def apply(numerator: Int, denominator: Int) : DivisionResult = {
    denominator match {
      case 0 => Infinite(numerator)
      case _ => Finite(numerator/denominator)
    }
  }
}

object test extends App {
  println(divide(1,2))
  println(divide(1,0))
  println(divide(-1,0))
  println(divide(2,-2))
}


