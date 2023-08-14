object T8Q2 extends App{

  println("Enter an integer:")
  val num = scala.io.StdIn.readInt()

  val result = (n: Int) => n match {
    case n if n < 0 => "Input is Negative"
    case n if n == 0 => "Input is Zero"
    case n if n % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

  println(result(num))
}

