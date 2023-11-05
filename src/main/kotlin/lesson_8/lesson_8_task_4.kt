package lesson_8

fun main() {
    val ingrList = listOf("молоко", "кофе", "ложка", "уксус", "мясо", "кетчуп")
    println("Ингридиенты: $ingrList")

    println("Выберите ингридиент для замены:")
    var userIngrChange = readln()

    if (userIngrChange in ingrList) {
        println("Введите новый ингридиент:")
        val newIngr = readln()

       ingrList.set(ingrList.indexOf(userIngrChange), newIngr)
        println("Готово! Вы сохранили следующий список: $ingrList")

    } else
        println("Такого ингридиента нет")
}