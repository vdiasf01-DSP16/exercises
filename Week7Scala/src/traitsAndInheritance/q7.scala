package traitsAndInheritance

trait Publication

trait Book extends Publication {
  val author : String
}

trait Periodical extends Publication {
  val editor : String
  val issues : List[Issue]
}

trait Issue {
  val volume : Int
  val issueNo : Int
  val manuscripts : Seq[Manuscript]
}

trait Document 
trait Manuscript extends Document with Book {
  val length : Int
  val author : String
}