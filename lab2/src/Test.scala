object Test {
  var primeNumbers: PrimeNumber = _

  def main(args: Array[String]): Unit = {
    try {
      primeNumbers = new PrimeNumber(args(0).toInt)
    } catch {
      case ex:NumberFormatException => println(s"Wrong argument. Must be positive integer\n$ex")
      case _:ArrayIndexOutOfBoundsException => println(s"Array seems to have no values.")
    }
    for (i <- 1 until args.length) {
      try {
        println(s"${args(i)} - ${primeNumbers.number(args(i).toInt)}")
      } catch {
        case _:NumberFormatException => println(s"${args(i)} - invalid argument")
        case _:IndexOutOfBoundsException => println(s"${args(i)} - out of range number")
      }
    }
  }
}
