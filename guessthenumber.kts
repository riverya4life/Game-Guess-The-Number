fun main() {
    println("Добро пожаловать в игру \"Угадай число\"!")
    println("Я загадал число от 1 до 100, попробуйте отгадать его.")

    val number = (1..100).random()
    var tries = 0

    while (true) {
        print("Введите ваше предположение: ")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Вы ввели не число, попробуйте еще раз.")
            continue
        }

        tries++

        when {
            guess == number -> {
                println("Поздравляю, вы угадали число за $tries попыток!")
                break
            }
            guess < number -> println("Загаданное число больше.")
            else -> println("Загаданное число меньше.")
        }
    }
}
