package ex2

object Test extends App{
  try{
    val pascaltr = new PascalTriangleRow(args(0).toInt)
    for (i <- 1 until args.length) {
      try {
        println(args(i) + " : " + pascaltr.factor(args(i).toInt))
      } catch {
        case _:NumberFormatException => println(s"${args(i)} : wrong argument")
        case _:IndexOutOfBoundsException => println(s"${args(i)} : out of range")
      }
    }
  } catch {
    case e:NumberFormatException => println(e)
    case _:IndexOutOfBoundsException => println(s"Couldn't find the first argument")
  }
}
