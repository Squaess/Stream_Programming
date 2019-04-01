class Pentagon(a: Double) extends Figure {
  def field: Double = (5.0/4.0) * scala.math.pow(a, 2) * ( 1/math.tan(math.toRadians(36)) )
  def perimeter: Double = 5 * a
}
