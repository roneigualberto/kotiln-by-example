package collections

fun main() {
    val numbers = listOf(1, 1, -1, 10, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println(positives)
    println(negatives)
}