package com.vechr.intermediate

class Client() {
    var token: String? = null
    fun connect() = println("connected!")
    fun authenticate() = println("authenticated!")
    fun getData(): String = "Mock data"
}


fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}

fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}

class Canvas {
    fun rect(x: Int, y: Int, w: Int, h: Int): Unit = println("$x, $y, $w, $h")
    fun circ(x: Int, y: Int, rad: Int): Unit = println("$x, $y, $rad")
    fun text(x: Int, y: Int, str: String): Unit = println("$x, $y, $str")
}

fun scopeFunctionCall() {
    val address: String? = getNextAddress()
    val confirm = if(address != null) {
        sendNotification(address)
    } else { null }

    // ******************************* Let *******************************
    // Use the let scope function when you want to perform null checks in your code and later perform further actions with the returned object.
    val confirm2 = address?.let {
        sendNotification(it)
    }

    // ******************************* Apply *******************************
    /**
     * The example has a Client class that contains one property called token and three member functions:
     * connect(), authenticate(), and getData().
     *
     * The example creates client as an instance of the Client class before initializing its token property
     * and calling its member functions in the main() function.
     */
    var client = Client()
    client.token = "asdf"
    client.connect()
    // connected!
    client.authenticate()
    // authenticated!
    client.getData()

    /**
     * if you use the apply scope function you can create, configure
     * and use member functions on your class instance all in the same place in your code:
     */
    val client2 = Client().apply {
        token = "asdf"
        connect()
        authenticate()
    }

    client2.getData()
    // connected!
    // authenticated!

    // ******************************* Run *******************************
    /**
     * Similar to apply, you can use the run scope function to initialize an object,
     * but it's better to use run to initialize an object at a specific moment in your code and immediately compute a result.
     */
    val result: String = client.run {
        connect()
        // connected!
        authenticate()
        // authenticated!
        getData()
    }

    println("Run $result")

    // ******************************* Also *******************************
    /**
     * Use the also scope function to complete an additional action with an object and then return the object to continue using it in your code, like writing a log.
     */
    val medals: List<String> = listOf("Gold", "Silver", "Bronze")
    val reversedLongUppercaseMedals: List<String> =
        medals
            .map { it.uppercase() }
            .also { println(it) }
            // [GOLD, SILVER, BRONZE]
            .filter { it.length > 4 }
            .also { println(it) }
            // [SILVER, BRONZE]
            .reversed()
    println(reversedLongUppercaseMedals)

    // ******************************* With *******************************
    /**
     * Unlike the other scope functions, with is not an extension function,
     * so the syntax is different. You pass the receiver object to with as an argument.
     */
    val mainMonitorSecondaryBufferBackedCanvas = Canvas()
    with(mainMonitorSecondaryBufferBackedCanvas) {
        text(10, 10, "Foo")
        rect(20, 30, 100, 50)
        circ(40, 60, 25)
        text(15, 45, "Hello")
        rect(70, 80, 150, 100)
        circ(90, 110, 40)
        text(35, 55, "World")
        rect(120, 140, 200, 75)
        circ(160, 180, 55)
        text(50, 70, "Kotlin")
    }
}