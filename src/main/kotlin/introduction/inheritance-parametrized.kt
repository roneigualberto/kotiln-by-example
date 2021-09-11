package introduction

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

open class Lion(val name: String, val origin: String) {

    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }

}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {

    val tiger: Tiger = SiberianTiger()

    tiger.sayHello()

    val lion = Asiatic("Rufo")

    lion.sayHello()


}