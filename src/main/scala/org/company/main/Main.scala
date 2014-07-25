package org.company.main

import org.company.demo.SampleLibraryClass

object Main {

  def main(args: Array[String]) {
    val smp = new SampleLibraryClass()
    println(smp.run("test"))
  }

}
