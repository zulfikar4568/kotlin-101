package com.vechr.intermediate.classes.animal

open class Dog(name: String) : Base(name) {
    override fun eat() {
        println("I eat meal")
    }

    open fun bark() {
        println("${name} is barking")
    }
}