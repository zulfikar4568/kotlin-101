package com.vechr.basic

fun exerciseNullSafety() {
    var neverNull: String = "This can't be null!"

    // neverNull = null // ERROR

    var nullable: String? = "Now it's ok"
    nullable = null // NO ERROR

    // Check null values
    nullChecker(nullable)
    println(lengthString(nullable))
}

fun nullChecker(data: String?) {
    if (data == null) {
        println("The data is empty")
    }

    println("There's data $data")
}

// Use safe calls
/**
 * To safely access properties of an object that might contain a null value, use the safe call operator ?..
 * The safe call operator returns null if either the object or one of its accessed properties is null.
 *
 * maybeString?.length =>>> is Evils operator ?
 * **/
fun lengthString(maybeString: String?): Int? = maybeString?.length