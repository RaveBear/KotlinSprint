package lesson_4

fun main() {
    val allTable = 13
    val reserveTable = 13
    val freeTable = 4

    println("Доступность столиков на сегодня: ${reserveTable > allTable}\n" +
            "Доступность столиков на завтра: ${freeTable <= allTable}")
}