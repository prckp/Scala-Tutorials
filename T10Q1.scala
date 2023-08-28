object T10Q1 extends App{
  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius* 9 / 5) + 32)
    val sumOfTemperatures = fahrenheitTemperatures.reduce((a, b) => a + b)
    val averageTemperature = sumOfTemperatures / temperatures.length
    averageTemperature
  }

  val inputTemperatures = List(0.0, 10.0, 20.0, 30.0)
  val average = calculateAverage(inputTemperatures)
  println(s"Average Fahrenheit temperature: $average")


}
