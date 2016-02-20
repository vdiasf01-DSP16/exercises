package mapReduce

sealed trait Shape {
  def sides : Int
  def perimeter : Double
  def area : Double
}

sealed trait Rectangular extends Shape {
  override def sides() : Int = 4 
}

final case class Circle(var radius: Double) extends Shape {
    override def sides() : Int = 1 
    override def perimeter() : Double = radius * 2 * Math.PI
    override def area() : Double = radius * radius * Math.PI
}

final case class Square(var size: Double) extends Rectangular {
    override def perimeter() : Double = size * 4
    override def area() : Double = size * size
}

final case class Rectangle(var width: Double, var height: Double) extends Rectangular {
    override def perimeter() : Double = ( width + height ) * 2
    override def area() : Double = width * height  
}

object Draw {
  def apply(shape: Shape) {
    shape match {
      case Circle(radius) => println("A circle of radius "+radius+"cm") 
      case Rectangle(w,h) => println("A rectangle of width "+w+" and height "+h+"cm") 
      case Square(size)   => println("A square of size "+size+"cm") 
    }
  }
}

object TraitAndInheritance extends App {

  Draw(Circle(10))
  Draw(Rectangle(3, 4))
  Draw(Square(4.5))

}