package forecast

import com.atomicscala.AtomicTest

object MyForecastTest extends App {
  var sunnyData = List(
      ( 100, "Sunny" ), 
      ( 80, "Mostly Sunny" ),
      ( 50, "Partly Sunny" ),
      ( 20, "Mostly Sunny" ),
      ( 0, "Cloudy" ),
      ( 15, "Unknown" )
  )
  sunnyData.foreach { 
    (x) => AtomicTest.any2Atomic(forecast(x._1)).is(x._2)           
  }
  
  AtomicTest.any2Atomic(forecast(100)).is("Sunny")
  AtomicTest.any2Atomic(forecast(80)).is("Mostly Sunny")
  AtomicTest.any2Atomic(forecast(50)).is("Partly Sunny")
  AtomicTest.any2Atomic(forecast(20)).is("Mostly Sunny")
  AtomicTest.any2Atomic(forecast(0)).is("Cloudy")
  AtomicTest.any2Atomic(forecast(15)).is("Unknown")
  
  def forecast(temp: Int) : String = {
    if( temp == 100 ) return "Sunny"
    if( temp == 80 ) return "Mostly Sunny"
    if ( temp == 50 ) return "Partly Sunny"
    if ( temp == 20 ) return "Mostly Sunny"
    if ( temp == 0 ) return "Cloudy"
    return "Unknown"
  }
}