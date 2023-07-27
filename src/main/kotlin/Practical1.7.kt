fun factorial(n: Int): Long {

    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    println("21012011123 | Rutvi")
    val number=5
    val result = factorial(number)
    print("Enter a Number:")
    val number1 = readLine()!!



    println("Factorial of $number is: $result")
    println(" By TailRec Keyword ,Factorial of $number is: $result")

}

