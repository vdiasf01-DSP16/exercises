

/**
 * Version 1 by adding the method light()
 * as per work sheet request.
 */
class Motorboat {
  def on() : String = {
    return "Motor on"
  }
  
  def off() : String = {
    return "Motor off"
  }

  def signal() : String = {
    val flare = new Flare
    return flare.light()
  }
}

/**
 * Version 2 by extending Signal which 
 * will execute the method light()
 * minimising code duplication.
 */
//class Motorboat extends Signal {
//  def on() : String = {
//    return "Motor on"
//  }
//  
//  def off() : String = {
//    return "Motor off"
//  }
//}