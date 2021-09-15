package collections

data class Person(val name: String, val city: String, val phone: String) {

}


fun main() {
    val people = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    val phoneBook = people.associateBy { it.phone }
    println(phoneBook)

    val cityBook = people.associateBy(Person::phone, Person::city)
    println(cityBook)

    val peopleCities = people.groupBy(Person::city, Person::name)
    println(peopleCities)

    val lastPersonCity = people.associateBy(Person::city, Person::name)
    println(lastPersonCity)

}