package lesson_4

const val IS_ANY_DAMAGE = false
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val HAS_SUPPLY_BOX = 50
const val IS_WEATHER_GOOD_OR_NOT = true

fun main() {
    println("Имеются ли повреждения?: ")
        val damage: Boolean = readln().toBoolean()

    println("Состав экипажа, человек: ")
        val crewSize: Int = readln().toInt()

    println("Ящики с провизией: шт.")
        val supplyBox: Int = readln().toInt()

    println("Погода благоприятная?: ")
        val weather: Boolean = readln().toBoolean()

    if ((damage == IS_ANY_DAMAGE) && (crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE))
        println("Плавание разрешено")

        else if ((supplyBox >= HAS_SUPPLY_BOX) && (weather == IS_WEATHER_GOOD_OR_NOT))
        println("Плавание разрешено")

        else
            println("Плавание запрещено")
    }
