package com.vechr.intermediate

class MyDummyClass {
    fun hello() {
        println("Hello World")
    }
}

fun MyDummyClass.hello2() {
    hello()
    println("Hello World x2")
}

fun callExtensionFunction() {
    val myDummy = MyDummyClass()

    myDummy.hello2()
}