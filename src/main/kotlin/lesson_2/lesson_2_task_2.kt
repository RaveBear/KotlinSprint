package lesson_2

val SALARY = 30_000
val SALARY_TRAINEE = 20_000

fun main() {
    val personal = 50
    val expensesPersonal = personal * SALARY

    val trainee = 30
    val expensesNewPersonal = trainee * SALARY_TRAINEE

    println("Зарплата постоянных сотрудников: $expensesPersonal руб.")
    println("Общие расходы на зарплату: ${expensesPersonal + expensesNewPersonal} руб.")

    val averageSalaryPerPerson = (expensesPersonal + expensesNewPersonal) / (personal + trainee)
    println("Средняя зарплата одного сотрудника: $averageSalaryPerPerson руб.")
}