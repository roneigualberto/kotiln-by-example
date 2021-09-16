package collections


fun main() {
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val mapBag = cart.map { it }

    println(mapBag)
    val flatMapBag = cart.flatMap { it }
    println(flatMapBag)

    val flatten = cart.flatten()
    println(flatten)
}