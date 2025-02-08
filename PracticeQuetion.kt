fun main() {
    val x = 102
    val y = 2
    val result = operations(100, 2)
    println(result)

    val value = checkCondition(x)
    println(value)
}

fun operations(x: Int, y: Int): Int {
    println("Sum: ${x + y}")
    println("Subtraction: ${x - y}")
    println("Multiplication: ${x * y}")
    println("Divide: ${x / y}")
    return x + y
}

fun checkCondition(x: Int): Triple<String, String, String> {
    val grade = when (x) {
        in 90..100 -> "Your Grade is A"

        in 75..89 -> "Your Grade is B"

        in 50..74 -> "Your Grade is C"

        else -> "You are fail."
    }

    val numberType = if (x % 2 == 0) "Number is Odd" else "Number is Even"

    val numberIs = if (x > 0) "Number is Positive" else if (x < 0) "Number is Negative" else "Number is zero"
    return Triple(numberIs, numberType, grade)
}

