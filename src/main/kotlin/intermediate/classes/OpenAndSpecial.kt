package com.vechr.intermediate.classes

/**
 * OPEN
 * If you can't use interfaces or abstract classes, you can explicitly make a class inheritable by declaring it as open.
 */
open class Vehicle(val make: String, val model: String) {
    open fun getInfo() {
        println("Make: $make and the Model is $model")
    }
}
class MercedesL200(make: String) : Vehicle(make, "L200") {
    override fun getInfo() {
        println("Make: $make and the Model is L200 by Mercedes")
    }
}

/**
 * SPECIAL
 * In addition to abstract, open, and data classes, Kotlin has special types of classes designed for various purposes,
 * such as restricting specific behavior or reducing the performance impact of creating small objects.
 *
 */

/**
 * SELAED SPECIAL
 * There may be times when you want to restrict inheritance.
 * Once you declare that a class is sealed, you can only create child classes from it within the same package.
 * It's not possible to inherit from the sealed class outside of this scope.
 */
sealed class Mammal(val name: String)
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

/**
 * ENUM SPECIAL
 * Enum classes are useful when you want to represent a finite set of distinct values in a class.
 * An enum class contains enum constants, which are themselves instances of the enum class.
 */
enum class State {
    IDLE, RUNNING, FINISHED
}

/**
 * Inline value classes
 * Sometimes in your code, you may want to create small objects from classes and use them only briefly.
 * This approach can have a performance impact.
 * Inline value classes are a special type of class that avoids this performance impact. However, they can only contain values.
 */
@JvmInline
value class Email(val address: String)

fun sendEmail(email: Email) {
    println("Sending email to ${email.address}")
}