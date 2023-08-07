object q2 extends App{
  def calculateSquare(input: List[Int]): List[Int] = {
    input.map(number => number * number)
  }

  val inputList = List(1, 2, 3, 4, 5)
  val outputList = calculateSquare(inputList)

  val formattedOutput = "[" + outputList.mkString(", ") + "]"
  println(formattedOutput)
}
