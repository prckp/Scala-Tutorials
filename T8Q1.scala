object T8Q1 extends App {
  println("Enter the deposit amount: ")
  val dep = scala.io.StdIn.readInt()

  val calcInterest: Double => Double = (dep) => {
    if (dep <= 20000) {
      dep * 0.02
    } else if (dep <= 200000) {
      dep * 0.04
    } else if (dep <= 2000000) {
      dep * 0.035
    } else {
      dep * 0.065
    }
  }

  val depInterest = calcInterest(dep)
  println(s"The interest for the deposit is: $depInterest")
}

