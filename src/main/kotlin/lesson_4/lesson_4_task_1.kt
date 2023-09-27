package lesson_4

val ALL_TABLE = 13

fun main() {
    val reserveTableToday = 13
    val freeTableTomorrow = 4

    println("Доступность столиков на сегодня: ${reserveTableToday > ALL_TABLE}\n" +
            "Доступность столиков на завтра: ${freeTableTomorrow <= ALL_TABLE}")
}