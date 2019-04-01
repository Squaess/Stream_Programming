class Rectangle(a: Double, b: Double) extends Quadrangle(a, a, b, b) {
  override def field: Double = a*b
}
