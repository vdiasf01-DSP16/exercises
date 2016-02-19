package mapReduce


sealed trait Shape {
  def sides : Int
  def perimeter : Double
  def area : Double
}

final case class Square(var size: Double) extends Shape {
    override def sides() : Int = 4 
    override def perimeter() : Double = size * 4
    override def area() : Double = size * size
}

final case class Circle(var radius: Double) extends Shape {
    override def sides() : Int = 1 
    override def perimeter() : Double = radius * 2 * Math.PI
    override def area() : Double = radius * radius * Math.PI
  
}

final case class Rectangle(var width: Double, var height: Double) extends Shape {
    override def sides() : Int = 4 
    override def perimeter() : Double = ( width + height ) * 2
    override def area() : Double = width * height  
}
  
object TraitAndInheritance extends App {

  var square = Square(4.5)
  println(square.sides())
  println(square.perimeter())
  println(square.area())

  var circle = Circle(4.5)
  println(circle.sides())
  println(circle.perimeter())
  println(circle.area())  
  
  var rectangle = Rectangle(4,5.1)
  println(rectangle.sides())
  println(rectangle.perimeter())
  println(rectangle.area())

}