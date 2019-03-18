class PrimeNumber(val n: Int) {

  if ( n <= 0 ) throw new NumberFormatException(s"Value n='$n' should be greater then 0")
  // primeNumbers(0) == primeNumbers(1) == false
  private var primeNumbers = Array.fill(2)(false)
  calculatePrimeNumbers(n)

  def calculatePrimeNumbers(n : Int): Unit = {
    if (n < primeNumbers.length) return
    primeNumbers = Array.fill(n+1)(true)
    primeNumbers(0) = false
    primeNumbers(1) = false
    for {
      i <- 2 until math.sqrt(primeNumbers.length).ceil.toInt
      if primeNumbers(i)
      j <- math.pow(i,2).toInt until primeNumbers.length by i
      if primeNumbers(j)
    } {
      primeNumbers(j) = false
    }
  }

  def number(m:Int):Int = {
    val primesInOrder = for (e <- primeNumbers.indices if primeNumbers(e)) yield e
    primesInOrder(m)
  }

  def showNumber():Unit = println(n)
}
