

// list
sealed trait IntList
final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

object testing extends App {
   Pair(1, Pair(2, Pair(3, End)))

   val d = End
   val c = Pair(3, d)
   val b = Pair(2, c)
   val a = Pair(1, b)

   def sum(list: IntList) : Int = 
     list match {
       case End => 0
       case Pair(hd,tl) => hd + sum(tl)
   }
   
   println(sum(a))
}

  
//  val l = Seq(1, 2, 3)
//  l.map( x => x*x )
//  
//  def f(x: Int) : Option[Int] = 
//    if (x>2) Some(x) else None
//    
//  println(l.map(x => f(x)))
//  println(l.flatMap(x => f(x)))
// 
//  val ll = List(2, 3, 4)
//  ll zip ll
//  println(ll zip ll)
//  
//  def g(x : Int) = List(x-1, x, x+1)
//  
//  println(ll.flatMap(x => g(x)))
//