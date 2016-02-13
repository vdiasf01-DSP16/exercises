package auxiliaryConstructors

class ClothesWasher( var modelName : String, var capacity: Double) {
  def this() = {
    this("Default", 0)
    var blah : String = "32" 
  }
  def this(model: String) = {
    var error : String = "primary constructor first" 
    this(model, 0)
  }
  def this(capa: Double) = this("Default", capa)

  override def toString() : String = {
    "ModelName: " + modelName + ", Capacity: " + capacity
  }
}

class ClothesWasher2(var modelName : String = "Default", var capacity: Double = 0) {
  override def toString() : String = {
    "ModelName: " + modelName + ", Capacity: " + capacity
  }
}

object AuxiliaryConstructors extends App {
  var cw = new ClothesWasher()
  println(cw.toString())

  var cw1 = new ClothesWasher("Something else")
  println(cw1.toString())
  
  var cw2 = new ClothesWasher(123)
  println(cw2.toString())

  
  var cw3 = new ClothesWasher2()
  println(cw3.toString())

  var cw4 = new ClothesWasher2(modelName = "Something else")
  println(cw4.toString())
  
  var cw5 = new ClothesWasher2(capacity = 123)
  println(cw5.toString())
}
