
import scala.annotation.elidable
import scala.annotation.elidable.ASSERTION

object partOneREPL {
    // The REPL
    // 1
    val value = 17
    println(value)
    
    // 2
    // value = 20 // Reassignment to val is not possible
    
    // 3
    val value2: String = "ABC1234" 
    println(value2)
    
    // 4
    // value2 = "!eewe" // It does not allow to change val
    // if changed to var, it will allow:
    var newValue : String = "rtere"
    newValue = "reae"
    println(newValue)
    
    // 5
    val questionFive = 15.56
    println(questionFive);
}

object partOneExpressions {
  // 1
  var sky : String = "Sunny"
  var temperature : Double = 85.4
  def isSunny1(sky: String, temperature: Double) : Boolean = {
    if ( sky.toLowerCase().equals("sunny") && temperature > 80 ) {
      return true
    }
    return false
  }

  if ( isSunny1(sky, temperature) ) {
      println("It is sunny")
  } else {
    println("It is not sunny")
  }

  // 2
  sky = "partly cloudy"
  temperature = 85
  def isSunny2(sky: String, temperature: Double) : Boolean = {
    if ( ( sky.toLowerCase().equals("sunny")
        || sky.toLowerCase().equals("partly cloudy") )
        && temperature > 80 ) {
      return true
    }
    return false
  }

  if ( isSunny2(sky, temperature) ) {
      println("It is sunny")
  } else {
    println("It is not sunny")
  }

  // 3
  sky = "partly cloudy"
  temperature = 18
  def isSunny3(sky: String, temperature: Double) : Boolean = {
    if ( ( sky.toLowerCase().equals("sunny")
        || sky.toLowerCase().equals("partly cloudy") )
        && ( temperature > 80 || temperature < 20 ) 
    ) {
      return true
    }
    return false
  }

  if ( isSunny3(sky, temperature) ) {
      println("It is sunny")
  } else {
    println("It is not sunny")
  }

  // 4
  def FahrenheitToCelcius(fahren: Double) : Double = {
    return ( fahren - 32 ) * 5 / 9     
  } 
  println("Fahrenheit 45 = " + FahrenheitToCelcius(45) + " C")

  // 5
  def CelciusTofahrenheit(celcius: Double) : Double = {
    return ( celcius * 9 / 5 ) + 32     
  } 
  println("Celcius 45 = " + CelciusTofahrenheit(45) + " F")

}

object partOneMethods {
  def getSquare(x : Int) : Int = x * x  
  // 1
  val a = getSquare(3)
  assert(a == 9);
  val b = getSquare(6)
  assert(b == 6*6);
  val c = getSquare(5)
  assert(c == 25);

  // 2
  def isArg1GreaterThanArg2(arg1 : Double, arg2 : Double) : Boolean = {
    if ( arg1 > arg2 ) { return true }
    return false
  }
  
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  assert(!t1)
  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  assert(t2)
  
  // 3
  def manyTimesString(str : String, x : Int) : String = {
    var string : String = ""
    for( i <- 1 to x ) {
      string += str
    }
    return string
  }
  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" == m1, "Expected 'abcabcabc' and got: '"+m1+"'")
  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "Expected '123123' and got: '"+m2+"'")
}

// Classes & Objects - question 1
object Range {
  val step = 2 // step must be initialised
  println(step)
}

object Range2 { // Cannot have two objects with the same name
  val step = 2
  println(step)
}

// 3
object s1 { var s : String = "Sally" }
object s2 { var s : String = "Sally" }

object partOneClassesMethods {
    Range
    Range2
//    assert(s1.equals(s2), "s1 and s2 are NOT equal, different object references")
//    assert(s2.equals(s1), "s1 and s2 are NOT equal, different object references")
//    assert(s2.s.equals(s1.s), "s1 and s2 are NOT equal, different string values")
  
}

object creatinClasses {
  // 1
  var hippo = new Hippo
  var lion = new Lion
  var tiger = new Tiger
  var monkey = new Monkey
  var giraffe = new Giraffe
  println("Hippo new instance memory address: " + hippo)
  println("Lion new instance memory address: " + lion)
  println("Tiger new instance memory address: " + tiger)
  println("Monkey new instance memory address: " + monkey)
  println("Giraffe new instance memory address: " + giraffe)
  
  // 2
  var lion1 = new Lion
  var giraffe1 = new Giraffe
  var giraffe2 = new Giraffe
  println("Lion1 new instance memory address: " + lion1)
  println("Giraffe1 new instance memory address: " + giraffe1)
  println("Giraffe2 new instance memory address: " + giraffe2)
}

object assertingSailboat {
  val sailboat = new Sailboat
  val r1 = sailboat.raise()
  assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
  
  val r2 = sailboat.lower()
  assert(r2 == "Sails lowered", "Expected Sails owered, Got " + r2)
  
  val motorboat = new Motorboat
  val s1 = motorboat.on()
  assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
  
  val s2 = motorboat.off()
  assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
  
}

object assertingFlare {
  val flare = new Flare
  val f1 = flare.light()
  assert(f1 == "Flare used!", "Expecgted Flare used!, Got " + f1)
}

object assertingSignal {
  val sailboat = new Sailboat
  val signal = sailboat.signal()
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

  val motorboat = new Motorboat
  val flare = motorboat.signal()
  assert(flare == "Flare used!", "Expected Flare used! Got " + flare)
}


object fieldsInClasses {
  // 1
//  val cup = new Cup
//  var list = List.apply(45, -15, -50)
//  for(i <- list) {
//    cup.add(i)
//    println("Max: " + cup.max + " %full: " + cup.percentFull)
//  }
//  println

  // 2 - changed Cup to not allow go below zero
  val cup = new Cup
  val list = List.apply(45, -55, 10, -9,  -2)
  for(i <- list) {
    cup.add(i)
    println("Max: " + cup.max + " %full: " + cup.percentFull)
  }
}

object main {
  def main(args: Array[String]): Unit = {
//    partOneREPL
//    partOneExpressions
//    partOneMethods
//    partOneClassesMethods
//    creatinClasses
//    assertingSailboat
//    assertingFlare
//    assertingSignal
    fieldsInClasses
  }
    
}
