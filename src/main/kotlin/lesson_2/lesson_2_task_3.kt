package lesson_2

fun main() {
    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val timeOfDeaprtureInMin = (hourOfDeparture * 60) + minutesOfDeparture // in min = 579
    val travelTime = 457 // in min

    val allTimeInMin = timeOfDeaprtureInMin + travelTime // 1036 min
    val arrivalTimeHours = allTimeInMin / 60
    val arrivalTimeMinutes = allTimeInMin % 60

    println(String.format("Время прибытия: %02d:%02d", arrivalTimeHours, arrivalTimeMinutes))

}