object Test {
  def main(args: Array[String]): Unit = {
    val bf = new CountingBloomFilter(10,3)

    def naturals(n: Int): Stream[Int] = n #:: naturals(n + 1)
    (naturals(0) take 2) foreach bf.add
    println(bf)

    (naturals(0) take 2) foreach bf.add
    println(bf)
    println(bf.contains(2))
    bf.add(2)
    println(bf.contains(2))
    bf.remove(2)
    println(bf.contains(2))
  }
}
