package controlflow.loops

fun main() {

    for (i in 0..3) {
        print(i)
    }

    print(" ")


    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }

    print(" ")

    for (c in 'a'..'d') {
        print(c)
    }

    print(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }

    print(" ")


}