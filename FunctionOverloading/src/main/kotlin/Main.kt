package com.eustache

fun main() {
    print("Enter a String: ")
    val input = readln()

    val reversed = input.reversed()

    if (input == reversed) {
        println("The string is a palindrome.")
    } else {
        println("The string is not a palindrome.")
    }

    println("Reversed String: $reversed")
}