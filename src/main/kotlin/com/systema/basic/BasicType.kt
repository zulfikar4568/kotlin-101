package com.vechr.basic

fun basicType() {
  var myVar = 2
  
  println(myVar)
  
  myVar = 3
  
  val myVal = 3
  
  // myVal = 4 // val cannot be reassigned
  
  println(myVar)
  println(myVal)  
  
  val year: Int = 2020
  val year2: Double = 2020.0
  val year3: Float = 2020.0f
  
  println(year + year2 + year3)
  
  val score: UInt = 100u // UByte, UShort, UInt, ULong
  val currentTemp: Float = 24.5f
  val price: Double = 19.99 // Float, Double
  val isEnabled: Boolean = true
  val myChar: Char = 'A'
  val message: String = "Hello, World!"
  
  println(score)
  println(currentTemp)
  println(price)
  println(isEnabled)
  println(myChar)
  println(message)
  
  println(year + 1)
  println(year - 1)
  println(year * 1)
  println(year / 1)
  println(year % 1)
  println(year == 1)
  println(year != 1)
  println(year > 1)
}