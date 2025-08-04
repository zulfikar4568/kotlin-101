package com.vechr.basic

// id and email is a properties
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

data class User(val name: String, val id: Int) {

}