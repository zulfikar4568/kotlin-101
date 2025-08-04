package com.vechr.basic

fun ifElse() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
}

fun whenControl() {
    val obj = "Hello"
    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
}

fun loopControl() {
    for (number in 1..5) {
        print(number)
    }

    val cakes: List<String> = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Lve this $cake cake!")
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    var cakesBaked = 0

    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}