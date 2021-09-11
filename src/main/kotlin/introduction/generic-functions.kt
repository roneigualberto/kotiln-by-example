package introduction


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {

    val stack = mutableStackOf(6, 7, 8, 2, 10)

    println(stack)
}