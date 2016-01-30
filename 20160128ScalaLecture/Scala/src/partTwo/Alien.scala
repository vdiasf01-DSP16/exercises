package partTwo

class Alien {
  def greet(person : Person) : Unit = {
    println("Hello: " + person.firstName)
  }
  def greet(giraffe : Giraffe) : Unit = {
    println("Hello: " + giraffe.firstName)
  }
}