object T9Q2 extends App{
  class Rational(val numerator: Int, val denominator: Int) {
    require(denominator != 0)

    private val gcd: Int = gcdCalculate(numerator.abs, denominator.abs)

    val simplifiedNumerator: Int = numerator / gcd
    val simplifiedDenominator: Int = denominator / gcd

    private def gcdCalculate(a: Int, b: Int): Int = {
      if (b == 0) a else gcdCalculate(b, a % b)
    }

    def sub(that: Rational): Rational = {
      new Rational(
        this.simplifiedNumerator * that.simplifiedDenominator - that.simplifiedNumerator * this.simplifiedDenominator,
        this.simplifiedDenominator * that.simplifiedDenominator
      )
    }

    override def toString: String = s"$simplifiedNumerator/$simplifiedDenominator"
  }

  // Define rational numbers x, y, and z
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val result = x.sub(y).sub(z)

  println(s"x - y - z = $result")

}