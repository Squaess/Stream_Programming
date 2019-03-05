/**
  * @author Bartosz Banasik
  *
  * Task 3, Lab 1
  *
  */

object GreatestDivisor {
  /**
    * Find the smallest divisor, after that divide number
    * by this divisor.
    *
    * @param number positive integer
    * @return greatest divisor for the ''number''
    */
  def gd(number: Int): Int = {
    /** Next line is ugly, but it's just for the exception */
    if (number == 0) return number/0
    if (number == 1) return 1
    for ( i <- 2 to scala.math.sqrt(number).toInt
          if number % i == 0) return number/i
    1
  }

  def main(args: Array[String]): Unit = {
    args.foreach( i =>
      try {
        /** Absolute in case of negative values */
        val greatest_divisor: Int = gd(i.toInt.abs)
        println(s"${i.toInt} : $greatest_divisor")
      } catch {
        case _: NumberFormatException => println("Could not convert '" + i + "' to int.");
        case ex: Throwable => println(i + ": Some throwable dunno, what happened but we keep going..." + ex.printStackTrace)
      }
    )
  }
}
