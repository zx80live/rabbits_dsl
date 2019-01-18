package com.zx80live.examples.rabbits

import org.scalatest.{FunSuite, Matchers}

class RowTest extends FunSuite with Matchers {

  test("|") {
    Row().content shouldEqual Vector.empty
    (Row() | "A").content.map(_.content) shouldEqual Vector("A")
    (Row() | "A" | "B").content.map(_.content) shouldEqual Vector("A", "B")
  }

  test("apply") {
    Row().content shouldEqual Vector.empty
    Row("A", "B", "C").content shouldEqual Vector(Cell("A"), Cell("B"), Cell("C"))
  }

  test("size") {
    Row().size shouldEqual 0
    Row("A", "B", "C").size shouldEqual 3
    (Row() | "A" | "B" | "C").size shouldEqual 3
  }

  test("toString") {
    Row().toString shouldEqual "<tr><td><pre>&nbsp;</pre></td></tr>"
    Row("A", "B", "C").toString shouldEqual "<tr><td><pre>A</pre></td><td><pre>B</pre></td><td><pre>C</pre></td></tr>"
    Row(
      """
        | \\
        |  \\_
        |   (_)
        |  / )
        |o( )_\_
      """.stripMargin,
      """
        |    \\
        |     \\_
        |  .---(')
        |o( )_-\_
      """.stripMargin
    ).toString shouldEqual "<tr><td><pre>\n&nbsp;\\\\\n&nbsp;&nbsp;\\\\_\n&nbsp;&nbsp;&nbsp;(_)\n&nbsp;&nbsp;/&nbsp;)\no(&nbsp;)_\\_\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td><td><pre>\n&nbsp;&nbsp;&nbsp;&nbsp;\\\\\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\\\\_\n&nbsp;&nbsp;.---(')\no(&nbsp;)_-\\_\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td></tr>"
  }
}
