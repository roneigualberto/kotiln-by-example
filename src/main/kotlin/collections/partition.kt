package collections

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val evenOdd = numbers.partition { it % 2 == 0 }
    println(evenOdd)

    val (positives, negatives) = numbers.partition { it > 0 }
    println(positives)
    println(negatives)
}