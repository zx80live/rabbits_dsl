package com.zx80live.examples.rabbits

import java.io.{BufferedWriter, File, FileWriter}

object Utils {
  def withWriter(filename: String)(f: BufferedWriter => Unit): Unit = {
    var bw: Option[BufferedWriter] = None
    try {
      bw = Some(new BufferedWriter(new FileWriter(new File(filename))))
      bw foreach f
    } finally {
      bw foreach (_.close())
    }
  }
}
