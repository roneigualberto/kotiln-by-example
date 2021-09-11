package introduction

fun main() {
    var neverNull = "This can´t be null"
    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
}