//Function to split a string
def splitWords(str : String) = str.split("\\s+")

val str = "This is a a test"
val words = splitWords(str)



//Longest word in a string
words.maxBy(_.length)


//Most commond word
words.groupBy(_.toString).mapValues(_.size)

//Most common letter
str.replaceAll("\\s", "") .groupBy(_.toChar).mapValues(_.size)

//Map of letter to word
val wordsList = words.toList.flatMap { w =>
  w.split(" ").filter(word => word.length > 0)
}
val wordsByLetter: Map[Char, List[String]] = wordsList.groupBy(_.head.toLower)