package lesson_8

fun main() {
    val ingrSalad = arrayOf("яйца", "кукуруза", "крабовые палочки", "майонез", "зелень")
    println("Выберите ингридиент: ")
    val userIngr = readln()
    for (x in ingrSalad) {
        if (userIngr in ingrSalad) {
            println("Ингридиент $userIngr в рецепте есть")
            break

        } else {
            println("Такого ингридиенты в рецепте нет")
            return
        }
    }
}