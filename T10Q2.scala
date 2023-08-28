object T10Q2 extends App{
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(word => word.length)
    val totalCount = wordLengths.reduce((a, b) => a + b)
    totalCount
  }

  val inputWords = List("apple", "banana", "cherry", "date")
  val count = countLetterOccurrences(inputWords)
  println(s"Total count of letter occurrences: $count")


}
