import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val rectangle = Rectangle(10, 20)
    rectangle.displayProperties()
    println("Is square: ${rectangle.isSquare()}")
    println("Is rectangle: ${rectangle.isRectangle()}")

    println("\n")
    val circle = Circle(10)
    circle.displayProperties()
}

interface Shape {
    val area: Double
    val perimeter: Double
    val diagonal: Double
}

class Rectangle(val height: Int, val width: Int) : Shape {


    fun displayProperties() {
        println("Area: $area")
        println("Perimeter: $perimeter")
        println("Diagonal: $diagonal")
    }

    fun isSquare(): Boolean {
        return height == width
    }

    fun isRectangle(): Boolean {
        return true
    }

    override val area: Double
        get() = height.toDouble() * width.toDouble()
    override val perimeter: Double
        get() = 2 * (height.toDouble() + width.toDouble())
    override val diagonal: Double
        get() = sqrt(height.toDouble().pow(2.0) + width.toDouble().pow(2.0))
}

data class Circle(val radius: Int) : Shape {
    override val area: Double
        get() = radius.toDouble().pow(2.0) * Math.PI
    override val perimeter: Double
        get() = 2 * Math.PI * radius.toDouble()
    override val diagonal: Double
        get() = 0.0
    fun displayProperties() {
        println("Area: $area")
        println("Perimeter: $perimeter")
    }
}