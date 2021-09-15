package collections

val openIssues: MutableSet<String> = mutableSetOf("u1", "u2", "u3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue = "u4"
    val anIssueAlreadyIn = "u2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}