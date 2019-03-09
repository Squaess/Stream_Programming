class PrimeNumber(val n: Int) {

  private var primeNumbers = Array(1, 2, 3, 4)

  def calculatePrimeNumbers(n : Int): Unit = {
    primeNumbers(1) = n
  }

  def showNumber() = println(n)
}
