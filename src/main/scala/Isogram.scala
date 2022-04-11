object Isogram {
  def isIsogram(word: String): Boolean = {
    word.groupBy(identity).forall { case (c, str) => if (c != ' ' && c != '-') str.length == 1 else true }
  }
}
