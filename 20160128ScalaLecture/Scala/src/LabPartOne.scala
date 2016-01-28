
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
  def getSquare(number : Int) : Double = {
    return number * number
  }
  
  val a = getSquare(3)
  assert(a == 9);
  
  val b = getSquare(6)
  assert(b == 6*6);
  
  val c = getSquare(5)
  assert(c == 25);
  
}

object main {
  def main(args: Array[String]): Unit = {
 //   partOneREPL
//    partOneExpressions
    partOneMethods
  }
    
}

