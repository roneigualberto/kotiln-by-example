package introduction

class Customer

class Contact(val id: Int, var email: String)


fun main() {
    val customer = Customer()

    println(customer)

    val contact = Contact(1, "ronei@gmail.com")

    println(contact.id)
    contact.email = "ronei.mac.rmg@gmail.com"

}