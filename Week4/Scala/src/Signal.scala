

class Signal {
  def signal() : String = {
    val flare = new Flare
    return flare.light()
  }
}