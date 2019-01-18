package com.zx80live.examples.rabbits

case class Cell(content: String, colspan: Int = 0) {

  override def toString: String = {
    val colspanAttr = if (colspan > 0) s""" colspan="$colspan"""" else ""
    val normalized = if (content.isEmpty) "&nbsp;" else content.replaceAll(" ", "&nbsp;")
    s"""<td$colspanAttr><pre>$normalized</pre></td>"""
  }
}

case class Row(content: Vector[Cell] = Vector.empty) {

  val size: Int = content.size

  def |(el: String): Row = copy(content = content :+ Cell(el))

  override def toString: String = {
    val normalized = if (content.isEmpty) Vector(Cell("")) else content
    s"""<tr>${normalized.mkString("")}</tr>"""
  }
}

object Row {
  def apply(els: String*): Row = new Row(els.map(e => Cell(e)).toVector)
}

class Table(content: Vector[Row] = Vector.empty, maxColumns: Int = 0) {

  def columns: Int = maxColumns

  def rows: Vector[Row] = map(identity)

  def foreach(f: Row => Unit): Unit = map(f)

  def |(el: String): Table = content match {
    case init :+ lastRow =>
      val updatedRow = lastRow | el
      val updatedColumns = maxColumns max updatedRow.content.size
      new Table(content = init :+ updatedRow, updatedColumns)

    case _ => new Table(content = Vector(Row() | el), maxColumns = 1)
  }

  def ||(el: String): Table = new Table(content = content :+ (Row() | el), maxColumns)

  def map[B](f: Row => B): Vector[B] = content map { r =>
    // add colspans attributes for smaller rows
    val normalized = r.content match {
      case init :+ c if r.size < columns =>
        val colspan = columns - r.content.size + 1
        Row(content = init :+ Cell(c.content, colspan))
      case _ => r
    }

    f(normalized)
  }

  override def toString: String = {
    val sb = new StringBuilder
    sb.append("""<table border="1">""")
    if (content.isEmpty)
      sb.append(Row())
    else
      foreach { row => sb.append(row) }
    sb.append("</table>")
    sb.toString()
  }
}

object Table {
  def apply(): Table = new Table()
}