package com.vechr.intermediate.classes.animal

open class Cat(name: String) : Base(name) {
  override fun eat() {
    println("${name} is eating fish")
  }

  open fun meow() {
    println("${name} is meowing")
  }
}