object T8Q3 extends App{
  val toUpper: String => String = (name: String) => name.toUpperCase()
  val toLower: String => String = (name: String) => name.toLowerCase()

  val formatNames: (String, String => String) => String = (name: String, formatFunc: String => String) => {
    formatFunc(name)
  }

  val name1 = "Benny"
  val name2 = "Niroshan"
  val name3 = "Saman"
  val name4 = "Kumara"

  val formattedName1 = formatNames(name1, toUpper)
  val formattedName2 = {
    val firstPart = formatNames(name2.substring(0, 2), toUpper)
    firstPart + name2.substring(2)
  }
  val formattedName3 = formatNames(name3, toLower)
  val formattedName4 = {
    val firstPart = formatNames(name4.substring(0, 1), toUpper)
    val middlePart = formatNames(name4.substring(1, 5), toLower)
    val lastPart = formatNames(name4.substring(5), toUpper)
    firstPart + middlePart + lastPart
  }

  println(formattedName1)
  println(formattedName2)
  println(formattedName3)
  println(formattedName4)
}

