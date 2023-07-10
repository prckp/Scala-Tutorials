object T5Q5 extends App {
  def evenSum(n: Int): Int = {
    if (n <= 0) {
      0
    } else {
      val currentNumber = if (n % 2 == 0) n else n - 1
      currentNumber + evenSum(currentNumber - 2)
    }
  }

  println(evenSum(8))



}
