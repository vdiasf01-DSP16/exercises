

class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    // Q2 - ensuring percentFull 
    // never goes below zero
    if( percentFull < 0 ) {
      percentFull = 0
    }
    percentFull
  }
}