package com.eustache

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun  main(){
    println("Enter a number: ");
    val input = readln();
    val isInputInteger = input.toIntOrNull();
    val output = when(isInputInteger){
        null -> "$input is not a valid integer";
        3 -> "The number is three";
        5 -> "The number is Five";
        in 10..20 -> "The number is between 10 and 20"
        else -> "The number is not three or five";
    }
    println(output)
}