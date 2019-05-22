import scala.util.hashing.MurmurHash3

class CountingBloomFilter(a_size:Int, h_number:Int) {
  require(a_size > 0 && h_number >0)
  val filter:Array[Int] = new Array[Int](a_size)
  val h1: MurmurHash3.type = MurmurHash3

  def add(item:Any): Unit = {
    for(i <- 0 until h_number) {
      val has = h1.stringHash(item.toString, i) % a_size
      val idx = if (has >= 0) has else has + a_size
      filter(idx) += 1
    }
  }

  def contains(item:Any): Boolean = {
    for(i <- 0 until h_number) {
      val has = h1.stringHash(item.toString, i) % a_size
      val idx = if (has >= 0) has else has + a_size
      if (filter(idx) == 0) return false
    }
    true
  }

  def remove(item:Any): Unit = {
    for(i <- 0 until h_number) {
      val has = h1.stringHash(item.toString, i) % a_size
      val idx = if (has >= 0) has else has + a_size
      filter(idx) = if (filter(idx) > 0) filter(idx) - 1 else throw new NoSuchElementException()
    }
  }

  override def toString: String = filter.mkString("")

}
