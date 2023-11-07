package lesson_8

fun main() {
    val ingrSalad = arrayOf("яйца", "кукуруза", "крабовые палочки", "майонез", "зелень")
    println("Выберите ингридиент: ")
    val userIngr = readln()
    if (userIngr in ingrSalad)
        println("Ингридиент $userIngr в рецепте есть")
    else
        println("Такого ингридиенты в рецепте нет")

}