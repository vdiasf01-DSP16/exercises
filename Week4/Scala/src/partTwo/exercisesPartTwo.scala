package partTwo

// Integer, Boolean, Long, Double
object q1 {
  var list = List(42, true, 123L, 42.0);
  list foreach( (x) => println("The type of '"+x+"' is: "+x.getClass()))
}

// Character and String
object q2 {
  var list = List('a', "a");
  list foreach( (x) => println("The type of '"+x+"' is: "+x.getClass()) )
}
  
// String and Unit
object q3 {
  var list = List("Hello world", println("Hello world"));
  list foreach( (x) => println("The type of '"+x+"' is: "+x.getClass()) )
}

object q4 {
  // Single quotes are for characters, not strings
  // var list = List('Hello world');
}

object q5 {
  // Predator
  val a = 1
  val b = 2
  if (a>b) println("Alien") else println("Predator")

  // 2001
  if (a>b) println("Alien") else println(2001)
  
  // hello
  if (true) println("hello")
}

object q6 {
  // 1 + 2 + 3 has three integers that are being added and
  // result in final integers 6
  // 6 is one single integer
}

object q7 {
  var utils = new PartTwoUtils
  utils.calc(2)
}

object q8 {
  var utils = new PartTwoUtils
  utils.calc2(2)
  utils.calc2(.32)
}

object q9 {
  argh.c + argh.b + argh.a
}

object argh {
  // a
  def a = {
    println("a")
    1
  }
  // b a
  def b = {
    println("b")
    a + 2
  }
  // c a b a
  def c = {
    println("c")
    a
    b + "c"
  }
}

object q10 {
  var person = new Person("John","Mathews")
  var alien = new Alien
  println("Greet() returning type is: "+ alien.greet(person).getClass())
  alien.greet(new Giraffe("Graciosa","Stretched"))
}

object test11 {
  def re() : Int = {0}
  def re(x : Int) : Int = { x * x }
}
object q11 {
  // Cannot use methods like values
//  test11.re() = 3
  // Methods return values from expressions either 
  // passed it on calculated withing the object
  println(test11.re( 2*2 ))
}

object exercises {
  def main(args: Array[String]) : Unit = {
    q1; q2; q3; q4; q5; q6; q7; q8; q9; q10;
    q11;
  }
}