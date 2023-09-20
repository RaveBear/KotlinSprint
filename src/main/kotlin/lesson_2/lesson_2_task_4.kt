package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre + crystalOre * 20 / 100) - crystalOre
    val bonusIronOre = (ironOre + ironOre * 20 / 100) - ironOre

    println("Бонусная Кристаллическая руда получена: $bonusCrystalOre")
    println("Бонусная Железная руда получена: $bonusIronOre")
}