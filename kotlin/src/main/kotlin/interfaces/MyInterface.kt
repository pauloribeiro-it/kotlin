package interfaces

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

fun main() {
    val child = Child()
    println(child.propertyWithImplementation)
    child.foo()
}