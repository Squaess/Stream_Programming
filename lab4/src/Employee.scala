class Employee(nam:String, salary:Double, id:Int) {
  val name: String = nam

  override def toString: String = nam + " " + salary.toString + " " + id.toString

}
