object Test {
  def main(args: Array[String]): Unit = {

    val algo = new MisraGries(4)
    val str2 = new Employee("Johnyy", 123, 2) #::
               new Employee("Johnyy", 123, 2) #::
               new Employee("Dan", 333, 1) #::
               new Car("red", 250) #::
               new Car("blue", 500) #::
               new Car("green", 300) #::
               new Car("green", 300) #::
               new Car("green", 300) #::
               new Car("green", 300) #::
               new Book("Bartosz", 2019) #::
               new Book("Bartosz", 2019) #::
               new Book("Bartosz", 2019) #::
               new Book("Bartosz", 2019) #::
               new Book("Bartosz", 2015) #::
               Stream.empty
    println(algo.compute(str2))

  }
}
