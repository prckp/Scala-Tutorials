object T5Q1 extends App {
  def findPrime(n: Int, divisor: Int = 2): Boolean = {
    if (n <= 1)
      false
    else if (divisor == n)
      true
    else if (n % divisor == 0)
      false
    else
      findPrime(n, divisor + 1)
  }


  println(findPrime(5))
  println(findPrime(8))
}