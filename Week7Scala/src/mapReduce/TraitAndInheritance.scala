package mapReduce

sealed trait Shape {
  var colour : Colour
  def sides : Int
  def perimeter : Double
  def area : Double
}

sealed trait Rectangular extends Shape {
  override def sides() : Int = 4 
}

final case class Circle(var radius: Double, c : Colour = NoColour()) extends Shape {
  override var colour = c
  override def sides() : Int = 1 
  override def perimeter() : Double = radius * 2 * Math.PI
  override def area() : Double = radius * radius * Math.PI
}

final case class Square(var size: Double, c : Colour = NoColour()) extends Rectangular {
  override var colour = c
  override def perimeter() : Double = size * 4
  override def area() : Double = size * size
}

final case class Rectangle(var width: Double, var height: Double, c : Colour = NoColour()) extends Rectangular {
  override var colour = c
  override def perimeter() : Double = ( width + height ) * 2
  override def area() : Double = width * height  
}

sealed trait Colour {
  val r : Int
  val g: Int
  val b : Int
  val colour : String
  val dark : Boolean = false
  override def toString() : String = { 
    if ( colour.length() > 0 ) colour
    else "RBG["+r+","+b+","+b+"]"
  }
}

final case class NoColour() extends Colour { 
  override val r = 255
  override val g = 255
  override val b = 255
  override val colour = "No Colour"
  override val dark = true
}

 final case class Yellow() extends Colour { 
  override val r = 255
  override val g = 255
  override val b = 0
  override val colour = "Yellow"
  override val dark = false
}

final case class Pink() extends Colour { 
override val r = 255
  override val g = 255
  override val b = 0
  override val colour = "Pink"
  override val dark = false
}

final case class Red() extends Colour { 
  override val r = 255
  override val g = 0
  override val b = 0
  override val colour = "Red"
  override val dark = false
}

final case class ColourBuilder(red:Int,green:Int,blue:Int,name:String,isLight:Boolean) extends Colour {
  override val r = red
  override val g = green
  override val b = blue
  override val colour = name
  override val dark = !isLight
  
}

object Draw {
  def apply(shape: Shape) {
    shape match {
      case Circle(radius, colour) => {
        println("A circle of radius "+radius+"cm with colour: " + colour.toString()) 
      }
      case Rectangle(w,h,colour) => {
        println("A rectangle of width "+w+" and height "+h+"cm with colour: " + colour.toString()) 
      }
      case Square(size,colour)   => {
        println("A square of size "+size+"cm with colour: " + colour.toString()) 
      }
    }
  }
}

object TraitAndInheritance extends App {

  Draw(Circle(10, ColourBuilder(23,32,54,"Mystic",false)))
  Draw(Rectangle(3, 4, Pink()))
  Draw(Square(4.5,Yellow()))

  Draw(Circle(10))

}