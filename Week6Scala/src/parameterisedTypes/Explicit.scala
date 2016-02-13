package parameterisedTypes

import scala.Vector
import com.atomicscala.AtomicTest

case class ParameterisedTypes() {
  // Return type is inferred: 
  def inferred(c1: Char, c2: Char, c3: Char) = { 
    Vector(c1, c2, c3) 
  }

  // Explicit return type: 
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = { 
    Vector(c1, c2, c3) 
  }
  
  // Explicit return double
  def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = { 
    Vector(d1, d2, d3) 
  }
  
}

object testParameterisedTypes extends App {
  AtomicTest.any2Atomic(ParameterisedTypes().inferred('a', 'b', 'c')).is("Vector(a, b, c)") 
  AtomicTest.any2Atomic(ParameterisedTypes().explicit('a', 'b', 'c')).is("Vector(a, b, c)") 
  
  AtomicTest.any2Atomic(ParameterisedTypes().explicitDouble(1.0, 2.0, 3.0)).is(Vector(1.0, 2.0, 3.0))

}