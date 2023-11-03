package com.thejipppp.example.metals.main

import com.thejipppp.example.metals.sub.Sub

object Main {
  def main(args: Array[String]): Unit = {
    val example = Sub.hello()
    println("This is an example: " + example)
  }
}
