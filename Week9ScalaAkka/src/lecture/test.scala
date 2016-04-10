package lecture

object SimpleActor extends App {
  
  val system = ActorSystem("winterfell")
  val hordor = system.actorOf(Props[Hordor], "Hordor")
  val arya = system.actorOf(Props[Arya], "Arya")
  val tyrion = system.actorOf(Props[GrumpyImp], "Tyrion")
  
  hordor ! "Hello"
  hordor ! "Do you say anything besides hordor?"
  
  hordor.tell(Greeting("Good morning!"), arya)
  
  arya.tell(Greeting("Don't expect to get anything out od that one"), tyrion)
  
  tyrion.tell(Greeting("Hordor"), hordor)
  
  hordor ! PoisonPill
  
  system.terminate()
  
}