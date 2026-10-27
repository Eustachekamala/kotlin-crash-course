package com.eustache

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter the index of your favorite number between 0 and 9: ");
    val input = readln();
    val inputAsInteger = input.toIntOrNull();
    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    if (inputAsInteger != null && inputAsInteger in favoriteNumbers.indices){
        println("Your favorite number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("The index you entered is out of bounds.")
    }
}