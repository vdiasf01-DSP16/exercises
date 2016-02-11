package forecast

import com.atomicscala.AtomicTest

object MyForecastTest extends App {
  var sunnyData = Vector(
      ( 100, "Sunny" ), 
      ( 80, "Mostly Sunny" ),
      ( 50, "Partly Sunny" ),
      ( 20, "Mostly Cloudy" ),
      ( 0, "Cloudy" ),
      ( 15, "Unknown" )
  )
  sunnyData.foreach { 
    (x) => AtomicTest.any2Atomic(forecast(x._1)).is(x._2)           
  }
  
  AtomicTest.any2Atomic(forecast(100)).is("Sunny")
  AtomicTest.any2Atomic(forecast(80)).is("Mostly Sunny")
  AtomicTest.any2Atomic(forecast(50)).is("Partly Sunny")
  AtomicTest.any2Atomic(forecast(20)).is("Mostly Cloudy")
  AtomicTest.any2Atomic(forecast(0)).is("Cloudy")
  AtomicTest.any2Atomic(forecast(15)).is("Unknown")
  
  def forecast(temp: Int) : String = {
    temp match {
      case 100 => "Sunny"
      case 80 => "Mostly Sunny"
      case 50 => "Partly Sunny"
      case 20 => "Mostly Cloudy"
      case 0 => "Cloudy"
      case _ => "Unknown"
    }
  }
}