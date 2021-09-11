package introduction

fun main() {
    println(describeString("Hello"))
    println(describeString(""))
    println(describeString(null))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.isNotEmpty()) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
