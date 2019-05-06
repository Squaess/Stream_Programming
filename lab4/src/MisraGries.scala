import scala.collection.mutable

class MisraGries(k:Int) {
  require(k>0)

  val A: mutable.Map[Any, Int] = mutable.Map()

  def compute(str:Stream[Any]):mutable.Map[Any,Int] = {
    str.foreach(a => {
      if(A.contains(a)) {
        A(a) = A(a) + 1
      } else if (A.size < (k-1)){
        A += (a -> 1)
      } else {
        A.keys.foreach(k => if (A(k) != 1) A(k) -= 1 else A.remove(k))
      }
    })
    A
  }

}
