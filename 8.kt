fun main() {
    val numbers = listOf(-2, 5, 10, -3, 7)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}