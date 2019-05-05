import scala.collection.mutable.Map

class MisraGries(k:Int) {
  require(k>0)

  val A: Map[Any, Int] = Map()

  def compute(str:Stream[Any]):Map[Any,Int] = {
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
