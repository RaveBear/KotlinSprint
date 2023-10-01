package lesson_4

const val HAS_NO_DAMAGE = true
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val HAS_SUPPLY_BOX = 50
const val IS_WEATHER_GOOD_OR_NOT = true

// Альтернативно - при незначительных повреждениях может отплыть
val ALT_CREW_SIZE = 70
val ALT_HAS_SUPPLY_BOX = 50
val ALT_IS_WEATHER_GOOD = true

fun main() {
    println("Повреждения отсутствуют?: ")
        val damage: Boolean = readln().toBoolean()

    println("Состав экипажа, человек: ")
        val crewSize: Int = readln().toInt()

    println("Ящики с провизией: шт.")
    val supplyBox: Int = readln().toInt()

    println("Погода благоприятная?: ")
    val weather: Boolean = readln().toBoolean()

    if ((damage == HAS_NO_DAMAGE) && (crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE || crewSize >= ALT_CREW_SIZE)
        && (supplyBox >= HAS_SUPPLY_BOX || supplyBox >= ALT_HAS_SUPPLY_BOX)
        && (weather == IS_WEATHER_GOOD_OR_NOT || weather == ALT_IS_WEATHER_GOOD)) {
            println("Плавание разрешено!")
        } else {
            println("Плавание ЗАПРЕЩЕНО!") }
    }
