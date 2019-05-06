class Employee(nam:String, sal:Double, identify:Int) {
  val name: String = nam
  val salary = sal
  val id = identify

  override def toString: String = nam + " " + salary.toString + " " + id.toString

  override def hashCode(): Int = 41 * (41 + identify) + salary.toInt + 37 * (37 + name.hashCode)
  override def equals(other: Any): Boolean = other match {
    case that: Employee => name == that.name && salary == that.salary && id == that.id
    case _ => false
  }
}
