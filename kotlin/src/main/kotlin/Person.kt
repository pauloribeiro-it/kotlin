package org.nb

class Person(val name: String, val age: Int) {

    var height: Double? = null

    constructor(name: String, age: Int, height: Double = 10.0) : this(name, age){
        this.height = height
    }

    fun displayInfo(){
        println("Name: $name, age: $age, height: $height")
    }
}

class Address{
    var street: String? = null
    constructor(street: String){
        this.street = street
    }

    fun displayInfo(){
        println("Street: $street")
    }
}

fun main(){
    val person = Person("Paulo", 31, 1.73)
    person.displayInfo()

    val address = Address("Av. Brasil")
    address.displayInfo()
}