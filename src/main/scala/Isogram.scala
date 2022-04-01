object Isogram extends App {
  println(isIsogram("lumberjacks"))
  println(isIsogram("isograms"))
  println(isIsogram("background"))
  println(isIsogram("ala"))
  println(isIsogram("downstream"))
  println(isIsogram("six-year-old"))
  println(isIsogram("six year old"))

  def isIsogram(word: String): Boolean = {
    word.groupBy(identity).forall { case (c, str) => if (c != ' ' && c != '-') str.length == 1 else true }
  }
}
