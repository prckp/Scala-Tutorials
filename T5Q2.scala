object T5Q2 extends App {
  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case _ => GCD(b, a % b)
  }

  def findPrime(prime: Int, divisor: Int = 2): Boolean = prime match {
    case x if x == divisor => true
    case x if GCD(prime, divisor) > 1 => false
    case x => findPrime(prime, divisor + 1)
  }

  def primeSeq(n: Int): Unit = {
    def printPrime(num: Int): Unit = {
      if (num < n) {
        if (findPrime(num)) {
          print(num + " ")
        }
        printPrime(num + 1)
      }
    }

    printPrime(2)
  }

  primeSeq(10)
}



