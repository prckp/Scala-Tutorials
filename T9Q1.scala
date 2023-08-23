object T9Q1 extends App{
  class Rational(val numerator: Int, val denominator: Int) {
    require(denominator != 0)

    private val gcd: Int = gcdCalculate(numerator.abs, denominator.abs)

    val simplifiedNumerator: Int = numerator / gcd
    val simplifiedDenominator: Int = denominator / gcd

    private def gcdCalculate(a: Int, b: Int): Int = {
      if (b == 0) a else gcdCalculate(b, a % b)
    }

    def neg: Rational = new Rational(-simplifiedNumerator, simplifiedDenominator)

    override def toString: String = s"$simplifiedNumerator/$simplifiedDenominator"
  }

  val x = new Rational(3, 4)

  val negX = x.neg

  println(s"Original x: $x")
  println(s"Negation of x: $negX")

}