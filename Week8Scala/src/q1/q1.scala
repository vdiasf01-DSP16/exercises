package q1

sealed trait LinkedList[T]
final case object End extends LinkedList[T]
final case class Pair(head: Int, tail: LinkedList[T]) extends LinkedList[T]

