package collections

fun main() {


    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //Any
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }
    println("Any Negative $anyNegative")
    println("Any Greater than 6  $anyGT6")

    //All
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println("All Even $allEven")
    println("All Less than 6  $allLess6")

    //None
    val allOdd = numbers.none { it % 2 == 0 }
    val allGT6 = numbers.none { it <= 6 }

    println("All Odd: $allOdd")
    println("All Greater than: $allGT6")
}