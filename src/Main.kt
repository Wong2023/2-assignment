fun main() {
    // Исходный список чисел
    val numbers = (1..100).toList()

    // 1. Фильтр чётных чисел
    val evens = numbers.filter { it % 2 == 0 }

    // 2. Квадраты всех чисел
    val squares = numbers.map { it * it }

    // 3. Сумма всех чисел через reduce
    val sum = numbers.reduce { acc, n -> acc + n }

    // Вывод
    println("Evens: $evens")
    println("Squares: $squares")
    println("Sum: $sum")
}
