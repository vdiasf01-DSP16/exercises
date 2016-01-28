
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
  val sky : String = "Sunny"
  val temperature : Integer = 85
  def isSunny(sky: String, temperature: Integer) : Boolean = {
    if ( sky.equals("sunny") && temperature > 80 ) {
      return true
    }
    return false
  }

  if ( isSunny(sky, temperature) ) {
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

