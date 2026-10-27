fun main() {
    // This function reads a line from the console and returns the sum of the numbers entered by the user.
    // It prompts the user to enter the amount of numbers in the sequence and then reads each number from the console.
    // It adds each number to a running total and finally prints the sum of all the numbers entered by the user.
    // It uses a while loop to read each number from the console and add it to a list of numbers.
    // It then calculates the sum of the numbers in the list using the sum() function.
    println("How many numbers will be in the sequence? ")
    val amountOfNumber = readln().toIntOrNull() ?: 0
    var sum=0;
    val numbers = mutableListOf<Int>()
    var i=0;
    while(i < amountOfNumber) {
        println("Enter a number: ")
        val number = readln().toIntOrNull() ?: 0
        numbers.add(number)
        sum += number
        i++
    }
    println("The sum of $numbers is $sum")
}