package com.vechr.basic

fun myMainSecondFunction() {
    var result = sum(1, 6)
    println(result)

    // name arguments
    result = sum(a = 1, b = 3)
    println(result)

    // default parameter
    myNames()

    println(multiply(2,3))

    register("Zulfikar")

    // before lambda
    fun upperCaseText(text: String): String {
        return text.uppercase()
    }

    // lambda function
    val upperCaseText = { text: String -> text.uppercase() }

    // lambda function - pass another func
    val numbers = listOf<Int>(-1, 3, -5, 5, -7)
    val positive = numbers.filter { x -> x > 0 }
    println(positive)

    val negative = numbers.filter { x -> x < 0 }
    println(negative)

    // lambda function - function types
    val lowerCaseText: (String) -> String = { text -> text.lowercase() }
    println(lowerCaseText("HALO"))

    // lambda function - return from a function
    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    val timesInMinutes = listOf<Int>(2, 10, 2, 3)
    val min2Sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.sumOf(min2Sec)
    println("The total time is $totalTimeInSeconds secs")

    // lambda function - Invoke separately
    println({ text: String -> text.uppercase() }("hello"))
}


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun myNames(first: String = "Zulfikar", last: String = "Isnaen" ) {
    println("$first $last")
}

// single expression function
fun multiply(a: Int, b: Int) = a * b

// early return function
fun register(name: String) {
    if (name == "Zulfikar") {
        println("Zulfikar has beed registered!")
        return
    }

    println("$name successfully registered!")
}