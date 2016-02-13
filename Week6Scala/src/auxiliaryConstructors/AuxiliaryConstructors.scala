package auxiliaryConstructors

class ClothesWasher(var modelName : String = "Default", var capacity: Double = 0) {
  override def toString() : String = {
    "ModelName: " + modelName + ", Capacity: " + capacity
  }
}

object AuxiliaryConstructors extends App {
  var cw = new ClothesWasher()
  println(cw.toString())

  var cw1 = new ClothesWasher(modelName = "Something else")
  println(cw1.toString())
  
  var cw2 = new ClothesWasher(capacity = 123)
  println(cw2.toString())
}
