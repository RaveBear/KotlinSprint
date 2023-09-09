package lesson_1

fun main() {
    val allSeconds = 6480
    val hour = allSeconds / 3600
    val minutes = (allSeconds / 60) % 60
    val seconds = allSeconds % 60

    println("$hour:$minutes:$seconds") /* не знаю как сделать так,
    чтоб нули оказались перед цифрой "1" и "0". Если только записать их в String */

    val hour1 = allSeconds / 3600
    hour1.toString()
    val minutes1 = (allSeconds / 60) % 60
    minutes1.toString()
    val seconds1 = allSeconds % 60
    seconds1.toString()

    println("0$hour1:$minutes1:0$seconds1")

}
