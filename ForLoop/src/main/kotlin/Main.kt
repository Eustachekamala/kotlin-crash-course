package com.eustache

fun main() {
    println("How many numbers will be in the sequence? ")
    val amountOfNumber = readln().toIntOrNull() ?: 0
    var sum=0
    val numbers = mutableListOf<Int>()

    for(i in 0 until amountOfNumber) {
        println("Please enter a number: #${i+1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        sum += number
    }
    println("The sum of numbers $numbers is $sum")
}