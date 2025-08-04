package com.vechr.intermediate.classes
import kotlin.properties.Delegates.observable

class Person(val firstName: String, val lastName: String) {
    var fullName: String = ""
        get() = field // "$firstName $lastName"
        set(value) {
            field = value.replaceFirstChar { firstChar -> firstChar.uppercase() }
        }
}

class Database {
    fun connect() {
        println("Connecting to the database...")
    }

    fun query(sql: String): List<String> {
        return listOf("Data1", "Data2", "Data3")
    }
}

val databaseConnection: Database by lazy {
    val db = Database()
    db.connect()
    db
}

fun fetchData() {
    val data = databaseConnection.query("SELECT * FROM data")
    val data2 = databaseConnection.query("SELECT * FROM data")
    println("Data: $data $data2")
}

class Thermostat {
    var temperature: Double by observable(20.0) { _, old, new ->
        if (new > 25) {
            println("Warning: Temperature is too high! ($old°C -> $new°C)")
        } else {
            println("Temperature updated: $old°C -> $new°C")
        }
    }
}

fun callGetterSetter() {
    fetchData()
    val thermostat = Thermostat()
    thermostat.temperature = 22.5
}