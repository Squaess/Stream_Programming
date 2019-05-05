val str = 1 #:: 2 #:: 3 #:: Stream.empty

def fibb(a:Int, b:Int): Stream[Int] = {
  a #:: fibb(b, a+b)
}

val fibs = fibb(1,1).take(7)
fibs.toList

import scala.collection.mutable.Map

val A:Map[String, Int] = Map()

A += ("Dupa" -> 1)
A += ("Kupa" -> 2)
A("Dupa") = 12

A.foreach(k => A(k._1) = 0)

println(A)
