object T5Q4 extends App{
  def oddOrEven(num:Int): String = num match {
    case 0 => "Even"
    case 1 => "Odd"
    case _ => oddOrEven(num - 2)
  }
  println(oddOrEven(357))

}

