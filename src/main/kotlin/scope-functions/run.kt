package `scope-functions`


fun getNullableLength(ns: String?) {
    println("for \"$ns\"")

    ns?.run {
        println("\tis empty? " + isEmpty())
        println("\t length = $length")
        length
    }


}

fun main() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with kotlin")
}