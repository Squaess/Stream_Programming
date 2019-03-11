package ex2

class PascalTriangleRow(val n: Int) {
  if (n < 0) throw new NumberFormatException("'n' must be a non negative integer")
  private val pascalRow: Array[Int] = calculate(n)

  private def calculate(n: Int): Array[Int] = {
    val pascalRow: Array[Int] =  new Array(n+1)
    pascalRow(0) = 1
    for ( i <- pascalRow.indices if i > 0) pascalRow(i) = pascalRow(i-1) * (n+1-i)/i
    pascalRow
  }

  def factor(m: Int): Int = {
    pascalRow(m)
  }
}
