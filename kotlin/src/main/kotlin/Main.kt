package org.nb

fun main() {
    mutableAndImmutableVariables()
    variableDeclaration()
    stringTemplate()
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