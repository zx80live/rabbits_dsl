package com.zx80live.examples.rabbits

case class Page(content: Any, title: String = "") {
  override def toString: String =
    s"""
       |<!DOCTYPE html>
       |<html>
       |  <head>
       |    <title>$title</title>
       |  </head>
       |  <body>
       |    <p>$content</p>
       |  </body>
       |</html>
    """.stripMargin
}
