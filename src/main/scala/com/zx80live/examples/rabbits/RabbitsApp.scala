package com.zx80live.examples.rabbits

import com.zx80live.examples.rabbits.AsciiLib.Animals._
import com.zx80live.examples.rabbits.AsciiLib.Plants._

object RabbitsApp {

  object MyTablePrinter {
    def apply(): Table = new Table()
  }

  def main(args: Array[String]): Unit = {
    val t = MyTablePrinter() |
      Rabbit1 | Rabbit2 | Rabbits ||
      TwoLittleRabbits | TwoLittleRabbits | TwoLittleRabbits ||
      Clover || "A" | "B" || Rabbit1

    val p = Page(t)
    println(p)

    Utils.withWriter("result.html") {
      _.write(p.toString)
    }
  }
}
