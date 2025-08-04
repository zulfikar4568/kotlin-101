package com.vechr.intermediate.classes.animal

import com.vechr.intermediate.classes.interfaces.Animal

open class Base(val name: String) : Animal {
    override fun eat() {
        println("${name} is eating")
    }
}