package com.vechr.intermediate

interface Auth {
    fun login(username: String, password: String)
}

/**
 * Objects can't have constructors, so they don't have headers like classes.
 */
object DoAuth : Auth{
    override fun login(username: String, password: String) {
        println("I'm login with user $username and password: ${encrypt(password)}")
    }

    private fun encrypt(password: String): String {
        var result: String = ""
        password.map { x -> result += "*" }
        return result
    }
}

data object AppConfig {
    var appName: String = "My App"
    var version: String = "1.0.0"
}

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { println("BONG ") }
        }
    }
}

fun callObject() {
    DoAuth.login("Andi", "Andi123")

    println(AppConfig)
    println(AppConfig.appName)
    println(AppConfig.version)

    BigBen.getBongs(5)
    BigBen.getBongs(1)
}