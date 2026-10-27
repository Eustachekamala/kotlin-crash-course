fun main() {
    // This function reads a line from the console and returns the sum of the numbers entered by the user.
    // It prompts the user to enter the amount of numbers in the sequence and then reads each number from the console.
    // It adds each number to a running total and finally prints the sum of all the numbers entered by the user.
    println("How many numbers will be in the sequence? ")
    val amountOfNumber = readln().toIntOrNull() ?: 0
    var sum=0;
    var i=0;
    while(i < amountOfNumber) {
        println("Enter a number: ")
        val number = readln().toIntOrNull() ?: 0
        sum += number
        i++
    }
    println("Sum of numbers: $sum")
}