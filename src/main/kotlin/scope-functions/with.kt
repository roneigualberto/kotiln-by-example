package `scope-functions`

fun main() {
    val str = "Some String"

    with(str) {
        println(repeat(10))
        print(substring(1))
    }
}