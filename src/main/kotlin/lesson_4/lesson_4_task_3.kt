package lesson_4

val WEATHER = "Солнечно"
val AWNING = "Открыт"
val HUMIDITY: Int = 20
val SEASON: String = "не зима"

fun main() {
    val weatherToday = "Солнечно"
    val isAwningOpen = "Открыт"
    val humidityToday = 20
    val seasonToday = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == WEATHER) &&
            (isAwningOpen == AWNING) and (humidityToday == HUMIDITY) && (seasonToday == SEASON)}")

}