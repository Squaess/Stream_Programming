object Test {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length){
      try {
        args(i) match {
          case "c" => {
            i += 1
            val c = new Circle(args(i).toDouble)
            println(
              s"""|Circle with r = ${args(i)}
                  |field = ${c.field}
                  |perimeter = ${c.perimeter}""".stripMargin)
          }
          case "ro" => {
            val r = new Rhombus(args(i+1).toDouble, args(i+2).toDouble)
            println(
              s"""|Rhombus with a = ${args(i+1)}, angle = ${args(i+2)}
                  |field = ${r.field}
                  |perimeter = ${r.perimeter}""".stripMargin)
            i += 2
          }
          case "s" => {
            val s = new Square(args(i+1).toDouble)
            println(
              s"""|Square with a = ${args(i+1)}
                  |field = ${s.field}
                  |perimeter = ${s.perimeter}""".stripMargin)
            i += 1
          }
          case "re" => {
            val s = new Rectangle(args(i+1).toDouble, args(i+2).toDouble)
            println(
              s"""|Rectangle with a = ${args(i+1)}, b = ${args(i+2)}
                  |field = ${s.field}
                  |perimeter = ${s.perimeter}""".stripMargin)
            i += 2
          }
          case "p" => {
            val s = new Pentagon(args(i+1).toDouble)
            println(
              s"""|Pentagon with a = ${args(i+1)}
                  |field = ${s.field}
                  |perimeter = ${s.perimeter}""".stripMargin)
            i += 1
          }
          case "h" => {
            val s = new Hexagon(args(i+1).toDouble)
            println(
              s"""|Hexagon with a = ${args(i+1)}
                  |field = ${s.field}
                  |perimeter = ${s.perimeter}""".stripMargin)
            i += 1
          }
          case _ => throw new IllegalArgumentException("Wrong argument " + args(i))
        }
      } catch {
        case _: NumberFormatException => println(s"Could not parse ${args(i)} to Double")
        case _: ArrayIndexOutOfBoundsException => println("Not enough value")
      }
      i += 1
    }
  }
}
