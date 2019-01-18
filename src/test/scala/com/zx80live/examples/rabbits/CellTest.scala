package com.zx80live.examples.rabbits

import org.scalatest.{FunSuite, Matchers}

class CellTest extends FunSuite with Matchers {

  test("toString") {
     Cell("").toString shouldEqual "<td><pre>&nbsp;</pre></td>"
     Cell("123").toString shouldEqual "<td><pre>123</pre></td>"
     Cell(" 123").toString shouldEqual "<td><pre>&nbsp;123</pre></td>"
     Cell("  123").toString shouldEqual "<td><pre>&nbsp;&nbsp;123</pre></td>"
     Cell("123 ").toString shouldEqual "<td><pre>123&nbsp;</pre></td>"
     Cell(" 123 ").toString shouldEqual "<td><pre>&nbsp;123&nbsp;</pre></td>"


     Cell(
      """
        | \\
        |  \\_
        |   (_)
        |  / )
        |o( )_\_
      """.stripMargin).toString shouldEqual "<td><pre>\n&nbsp;\\\\\n&nbsp;&nbsp;\\\\_\n&nbsp;&nbsp;&nbsp;(_)\n&nbsp;&nbsp;/&nbsp;)\no(&nbsp;)_\\_\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre></td>"
  }
}
