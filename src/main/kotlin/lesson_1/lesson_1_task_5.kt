package lesson_1

fun main() {
    val allSeconds = 6480
    val hour = allSeconds / 3600
    val h = String.format("%02d", hour)

    val minutes = (allSeconds / 60) % 60
    val m = String.format("%02d", minutes)

    val seconds = allSeconds % 60
    val s = String.format("%02d", seconds)
    println("$h:$m:$s")


}
