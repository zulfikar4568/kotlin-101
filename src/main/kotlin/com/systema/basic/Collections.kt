package com.vechr.basic

fun collectionList() {
  var myShapes = listOf("Circle", "Square", "Triangle")
  println(myShapes.contains("Circle"))
  println(myShapes.contains("Rectangle"))
  println(myShapes.size)
  println(myShapes.first())
  println(myShapes.last())
  println(myShapes.reversed())
  println(myShapes.sorted())
  println(myShapes.map { it.uppercase() })
  println(myShapes.filter { it.length > 5 })

  val shapes: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
  shapes.add("Rectangle")
  println(shapes)

  shapes.remove("Square")
  println(shapes)

  // To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a List:
  val shapesLocked: List<String> = shapes
  println(shapesLocked)
}

fun collectionSet() {
  val myUniqueData: Set<Int> = setOf(1, 2, 3, 4, 5, 1)
  println(myUniqueData)

  val myUniqueDataMutable: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 1)
  myUniqueDataMutable.add(6)
  println(myUniqueDataMutable)

  val myUniqueDataLocked: Set<Int> = myUniqueDataMutable
  println(myUniqueDataLocked)

  myUniqueDataMutable.clear()
  println(myUniqueDataMutable)

  myUniqueDataMutable.add(1)
  println(myUniqueDataMutable)

  myUniqueDataMutable.add(1)
  println(myUniqueDataMutable)
}

fun collectionMap() {
  val myMap: Map<String, Int> = mapOf("Apple" to 1, "Banana" to 2, "Cherry" to 3)
  println(myMap)

  val myMapMutable: MutableMap<String, Int> = mutableMapOf("Apple" to 1, "Banana" to 2, "Cherry" to 3)
  myMapMutable.put("Orange", 4)
  myMapMutable["Apple"] = 5
  println(myMapMutable)
}