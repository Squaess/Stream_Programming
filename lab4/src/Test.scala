object Test {
  def main(args: Array[String]): Unit = {
    val e1 = new Employee("John", 123.6, 2)

    val algo = new MisraGries(2)
    val str = 1 #:: 4 #:: 5 #:: 4 #:: 4 #:: 5 #:: 4 #:: 4 #:: Stream.empty
    val str2 = new Employee("Johnyy", 123, 2) #::
               new Employee("Johnyy", 123, 2) #::
               new Employee("Dan", 333, 1) #::
               Stream.empty
    println(algo.compute(str))
    println(algo.compute(str2))

  }
}
