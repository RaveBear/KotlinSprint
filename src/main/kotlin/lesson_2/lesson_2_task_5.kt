package lesson_2

import kotlin.math.pow

fun main() {
    val clientDeposit = 70_000
    val bidParcent = 16.7 // in %

    val clientDepositResult = clientDeposit * (1 + (bidParcent / 100)).pow(20)
    println(String.format("%.3f", clientDepositResult))
    }