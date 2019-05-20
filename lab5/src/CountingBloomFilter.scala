import scala.util.hashing.MurmurHash3

class CountingBloomFilter {

  val h1: MurmurHash3.type = MurmurHash3
  println("Hash1 on 'dupa' " + h1.stringHash("dupa", 1))
  println("Hash2 on 'dupa' "+ h1.stringHash("dupa", 2))
  println("Hash1 on 'dupa' " + h1.stringHash("dupa", 1))

}
