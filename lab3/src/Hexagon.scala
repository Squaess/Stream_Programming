class Hexagon(a: Double) extends Figure {
  override def field: Double = 3 * a * a * math.sqrt(3) / 2
  override def perimeter: Double = 6*a
}
