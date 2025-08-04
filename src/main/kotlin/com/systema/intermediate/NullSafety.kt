package com.vechr.intermediate

/**
 * is and !is operators
 * is checks if the object has the type and returns a boolean value.
 *
 * !is checks if the object doesn't have the type and returns a boolean value.
 */

fun printObjectType(obj: Any) {
    when (obj) {
        is Int -> println("It's an Integer with value $obj")
        !is Double -> println("It's NOT a Double")
        else -> println("Unknown type")
    }
}

fun callNullSafety() {
    val myInt = 42
    val myDouble = 3.14
    val myList = listOf(1, 2, 3)

    // The type is Int
    printObjectType(myInt)
    // It's an Integer with value 42

    // The type is List, so it's NOT a Double.
    printObjectType(myList)
    // It's NOT a Double

    // The type is Double, so the else branch is triggered.
    printObjectType(myDouble)
    // Unknown type

    /**
     * as and as? operator
     * To explicitly cast an object to any other type, use the as operator.
     * This includes casting from a nullable type to its non-nullable counterpart.
     * If the cast isn't possible, the program crashes at runtime. This is why it's called the unsafe cast operator.
     */

    val a: String? = null
    val b = a as? String

    // Returns null value
    print(b)
    // null

    val emails: List<String?> = listOf("alice@example.com", null, "bob@example.com", null, "carol@example.com")
    val validEmails = emails.filterNotNull()

    println(validEmails)
}