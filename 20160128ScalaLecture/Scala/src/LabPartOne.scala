

object main {
  def main(args: Array[String]): Unit = {
    
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
}

