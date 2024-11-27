package org.nb

import java.lang.Exception

fun main() {
//    mutableAndImmutableVariables()
//    variableDeclaration()
//    stringTemplate()
//    lists()
//    sets()
//    maps()
//    ifs()
//    whenUsage()
//    arrays()
//    forLoop()
//    requireTest(false)
//    check(false)
//    error("Message")
//    usingMyException()
}

fun mutableAndImmutableVariables(){
    val immutableVariable = 5
    var mutableVariable = 10
    mutableVariable++
    println(immutableVariable)
    println(mutableVariable)
}

fun variableDeclaration(){
    val declaredVariable: Int
    val declaredAndInitializedVariable: String = "Paulo"

    declaredVariable = 14
    println(declaredVariable)
    print(declaredAndInitializedVariable)
}

fun stringTemplate(){
    val name = "Paulo"
    val age = 31

    println("My name is $name and I'm $age years old")
}

fun lists(){
    val immutableList: List<String> = listOf("Paulo", "Mônica")
    val mutableList: List<String> = mutableListOf("Toyota", "Volkswagen", "Honda")
    println(immutableList)
    println(mutableList)
}

fun sets(){
    val immutableSet: Set<String> = setOf("Player 1", "Player 2")
    val mutableSet: Set<String> = mutableSetOf("Xbox", "Playstation", "Nintendo")
    println(immutableSet)
    println(mutableSet)
}

fun maps(){
    val immutableMap: Map<Int, String> = mapOf(1 to "a", 2 to "b")
    val mutableMap: Map<Int, String> = mutableMapOf(1 to "a", 2 to "b")
    println(immutableMap)
    println(mutableMap)
    println(1 in immutableMap.keys)
    println(immutableMap.keys.contains(1))
}

fun arrays(){
    var simpleArray = arrayOf("Nile", "Amazon", "Yangtze")
    println(simpleArray.joinToString())

    // empty array
    // var exampleArray = emptyArray<String>()
    // var exampleArray: Array<String> = emptyArray()

    val numbersArray = Array<Int> (3) {0}

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
}

fun smartCast(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
}

fun ifs(){
    var message: String
    val age = 19

    message = if(age > 18) "adult" else "young"
    println(message)
}

fun whenUsage(){
    val gender = 'M'
    var description: String
    val month = 11
    val car = "Honda"

    //with subject
    when(gender){
        'M' -> println("Masculine")
        'F' -> println("Feminine")
        else -> println("Not identified")
    }

    //without subject
    when {
        gender == 'M' -> println("Masculine")
        gender == 'F' -> println("Feminine")
        else -> println("Not identified")
    }

    //expression
    description =  when(gender){
        'M' -> "Masculine"
        'F' -> "Feminine"
        else -> "Not identified"
    }

    println(description)

    when(month){
        month % 2 -> println("Even")
        else -> println("Odd")
    }

    when (car){
        "Honda", "Toyota", "Nissan" -> println("Japanese")
        "Audi", "Volkswagen", "BMW" -> println("German")
        "Aston Martin", "McLaren"-> println("Britain")
    }
    val x = 10
    val validNumbers = arrayOf(10, 20, 30, 40, 50)

    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}
fun forLoop(){
    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for(number in numbers)
        print("$number ")

    println()

    for(number in numbers.indices step 2)
        print("$number ")

    println()

    for (i in 6 downTo 0 step 2) {
        print(i)
    }

    println()

    for ((index, value) in numbers.withIndex()) {
        println("the element at $index is $value")
    }
}

fun requireTest(success: Boolean){
    require(success) {"Require $success"}
}

fun checkTest(success: Boolean){
    check(success) {"Success $success"}
}

fun errorTest(){
    error("Error test")
}

class MyException(message: String = "MyException") : Exception(message)

fun usingMyException():Nothing{
    throw MyException("Testing")
}