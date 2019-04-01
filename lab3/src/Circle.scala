class Circle(r: Double) extends Figure {
  def field: Double = math.Pi * r * r
  def perimeter: Double = 2 * math.Pi * r
}
