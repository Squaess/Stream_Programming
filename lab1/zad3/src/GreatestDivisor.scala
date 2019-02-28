object GreatestDivisor {

  def gd(number: Int): Int = {
    for ( i <- (1 until number).reverse
          if number % i == 0) return i
    1
  }

  def main(args: Array[String]): Unit = {
    args.foreach( i =>
      try {
        val greatest_divisor: Int = gd(i.toInt)
        println(s"Greatest divisor for ${i.toInt} except ${i.toInt} is: $greatest_divisor")
      } catch {
        case _: NumberFormatException => println("Could not convert '" + i + "' to int.");
        case ex: Throwable => println("Some throwable dunno, what happened but we keep going..." + ex.printStackTrace)
      }
    )
  }
}
