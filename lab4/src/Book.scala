class Book(auth:String, y: Int) {
  val author = auth
  val year = y

  override def toString: String = "Book " + author + " " + year.toString

  override def hashCode(): Int = 41 * (41 + y) + author.hashCode

  override def equals(obj: Any): Boolean = obj match {
    case that: Book => author == that.author && year == that.year
    case _ => false
  }

}
