package collections


fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()
    val eventCount = numbers.count { it % 2 == 0 }

    println(totalCount)
    println(eventCount)
}