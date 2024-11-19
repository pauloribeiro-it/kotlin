package org.nb

fun main() {
//    mutableAndImmutableVariables()
//    variableDeclaration()
//    stringTemplate()
//    lists()
//    sets()
    maps()
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