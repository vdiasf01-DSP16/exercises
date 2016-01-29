

/**
 * Version 1 by adding the method light()
 */
class Sailboat {
  def raise() : String = {
    return "Sails raised"
  }
  def lower() : String = {
    return "Sails lowered"
  }
  def signal() : String = {
    val flare = new Flare
    return flare.light()
  }
}

/**
 * Version 2 by extending Signal which 
 * will execute the method light()
 */
//class Sailboat extends Signal {
//  def raise() : String = {
//    return "Sails raised"
//  }
//  def lower() : String = {
//    return "Sails lowered"
//  }
//}