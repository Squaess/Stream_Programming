val str = 1 #:: 2 #:: 3 #:: Stream.empty

def fibb(a:Int, b:Int): Stream[Int] = {
  a #:: fibb(b, a+b)
}

val fibs = fibb(1,1).take(7)
fibs.toList

import scala.collection.mutable

val A:mutable.Map[Any, Int] = mutable.Map()
val e1 = new Employee("johne", 123.2, 1)
val e2 = new Employee("johne", 123.2, 1)
val e3 = new Employee("johne", 123.2, 2)

A += ("Dupa" -> 1)
A += ("Kupa" -> 2)
A += (e1 -> 120)

A.contains(e2)
A.contains(e3)
e1 == e2
e1 == e3

