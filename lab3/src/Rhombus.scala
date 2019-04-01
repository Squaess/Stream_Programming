class Rhombus(a: Double, angle:Double) extends Quadrangle(a,a,a,a) {
  def field:Double = a*a * math.sin(math.toRadians(angle))
}
