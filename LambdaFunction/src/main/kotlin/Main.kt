package com.eustache

fun main() {
    print("Enter a String: ")
    val input = readln()

    // Lambda function
    val filteredString = input.filter {
        it.isLetter()
    }
    println("Filtered String: $filteredString")
}