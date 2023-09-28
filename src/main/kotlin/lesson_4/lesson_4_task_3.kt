package lesson_4

val IS_SUNNY_WEATHER = true
val IS_AWNING_OPEN = true
val HUMIDITY: Int = 20
val SEASON: String = "не зима"

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val humidityToday = 20
    val seasonToday = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunnyWeather == IS_SUNNY_WEATHER) &&
            (isAwningOpen == IS_AWNING_OPEN) and (humidityToday == HUMIDITY) && (seasonToday != SEASON)}")

}