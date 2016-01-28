
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
  var temperature : Integer = 85
  def isSunny1(sky: String, temperature: Integer) : Boolean = {
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
  def isSunny2(sky: String, temperature: Integer) : Boolean = {
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
  def isSunny3(sky: String, temperature: Integer) : Boolean = {
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

}

object main {
  def main(args: Array[String]): Unit = {
 //   partOneREPL
    partOneExpressions
  }
    
}

