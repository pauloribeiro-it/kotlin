package interfaces

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}


class Employee (val fName:String, val lName:String): Person{
    override val firstName: String
        get() = fName
    override val lastName: String
        get() = lName
}

fun main() {
    var employee = Employee("Paulo", "Ribeiro")
    println("First Name: ${employee.firstName}, Last Name: ${employee.lastName}")
}