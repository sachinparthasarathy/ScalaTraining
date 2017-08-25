


def splitWords(str : String) = str.split("\\s+")

val str = "This is a a test"
val words = splitWords(str)

//List of all characters in a string
words.flatMap(_.toCharArray)


