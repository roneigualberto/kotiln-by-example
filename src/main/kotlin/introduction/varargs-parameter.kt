package introduction

fun main() {

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    printAll("Hello", "World", "Kotlin")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "World", "Kotlin", prefix = "Greeting: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("10", "10")


}