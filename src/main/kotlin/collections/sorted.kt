package collections

import kotlin.math.abs

fun main() {
    val shuffed = listOf(5, 4, 2, 1, 3, -10)
    val natural = shuffed.sorted()
    val inverted = shuffed.sortedBy { -it }
    val decending = shuffed.sortedDescending();
    val decendingBy = shuffed.sortedByDescending { abs(it) };

    println(natural)
    println(inverted)
    println(decending)
    println(decendingBy)
}