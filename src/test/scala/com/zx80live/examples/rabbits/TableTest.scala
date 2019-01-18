package com.zx80live.examples.rabbits

import org.scalatest.{FunSuite, Matchers}

class TableTest extends FunSuite with Matchers {

  test("columns") {
    Table().columns shouldEqual 0
    (Table() | "A").columns shouldEqual 1
    (Table() | "A" | "B" | "C").columns shouldEqual 3
    (Table() | "A" | "B" | "C" || "D" | "E" || "F").columns shouldEqual 3
  }

  test("rows") {
    Table().rows shouldEqual Vector.empty
    (Table() | "A" | "B" | "C").rows shouldEqual Vector(Row("A", "B", "C"))
  }

  test("|") {
    Table().rows shouldEqual Vector.empty
    (Table() | "A").rows shouldEqual Vector(Row("A"))
    (Table() | "A" | "B" | "C").rows shouldEqual Vector(Row("A", "B", "C"))
    (Table() | "A" || "B" | "C").rows shouldEqual Vector(Row(Vector(Cell("A", 2))), Row("B", "C"))
    (Table() | "A" || "B" | "C" | "D").rows shouldEqual Vector(Row(Vector(Cell("A", 3))), Row("B", "C", "D"))
  }

  test("||") {
    Table().rows shouldEqual Vector.empty
    (Table() || "A").rows shouldEqual Vector(Row("A"))
    (Table() || "A" || "B").rows shouldEqual Vector(Row("A"), Row("B"))
  }

  test("toString") {
    Table().toString shouldEqual "<table border=\"1\"><tr><td><pre>&nbsp;</pre></td></tr></table>"
    (Table() | "A" | "B" | "C" || "D" | "E" || "F").toString shouldEqual "<table border=\"1\"><tr><td><pre>A</pre></td><td><pre>B</pre></td><td><pre>C</pre></td></tr><tr><td><pre>D</pre></td><td colspan=\"2\"><pre>E</pre></td></tr><tr><td colspan=\"3\"><pre>F</pre></td></tr></table>"
    (Table() | "A" || "B" | "C" || "D" | "E" | "F").toString shouldEqual "<table border=\"1\"><tr><td colspan=\"3\"><pre>A</pre></td></tr><tr><td><pre>B</pre></td><td colspan=\"2\"><pre>C</pre></td></tr><tr><td><pre>D</pre></td><td><pre>E</pre></td><td><pre>F</pre></td></tr></table>"
  }

}
