  object T4Q3 extends App {
    def toUpper(name: String): String = {
      name.toUpperCase()
    }

    def toLower(name: String): String = {
      name.toLowerCase()
    }

    def formatNames(name: String)(formatFunc: String => String): String = {
      formatFunc(name)
    }
      val name1 = "Benny"
      val name2 = "Niroshan"
      val name3 = "Saman"
      val name4 = "Kumara"

      val formattedName1 = T4Q3.formatNames(name1)(T4Q3.toUpper)
      val formattedName2 = T4Q3.formatNames(name2.substring(0,2))(T4Q3.toUpper)+name2.substring(2)
      val formattedName3 = T4Q3.formatNames(name3)(T4Q3.toLower)
      val formattedName4 = T4Q3.formatNames(name4.substring(0,1))(T4Q3.toUpper)+T4Q3.formatNames(name4.substring(1,5))(T4Q3.toLower)+T4Q3.formatNames(name4.substring(5))(T4Q3.toUpper)

      println(formattedName1)  // Output: BENNY
      println(formattedName2)  // Output: NIroshan
      println(formattedName3)  // Output: saman
      println(formattedName4)  // Output: KumarA
  }
