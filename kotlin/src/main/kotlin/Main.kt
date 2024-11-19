package org.nb

fun main() {
    mutableAndImmutableVariables()
    variableDeclaration()
    stringTemplate()
    lists()
    sets()
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