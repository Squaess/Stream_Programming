class Car(col:String, maxSpe:Double) {
  val color = col
  val maxSpeed = maxSpe

  override def toString: String = "Car " + color + " " + maxSpeed.toString

  override def hashCode(): Int = 41 * (41 + color.hashCode) + maxSpeed.hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that: Car => color == that.color && maxSpeed == that.maxSpeed
    case _ => false
  }

}
