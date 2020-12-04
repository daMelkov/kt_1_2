// Cyrillic in console: Run/Edit Configuration/VM options: -Dfile.encoding=UTF-8

fun main() {
    val minComission = 3500
    val percentComission = .0075

    while(true) {
        print("Введите сумму перевода в копейках (пустая строка - выход):")
        val input = readLine()
        if(input!!.isEmpty()) {
            println("Работа завершена.")
            return
        }

        val amount = input.toInt()
        if(amount < minComission) {
            println("Сумма недостаточна для перевода. Минимум: $minComission")
            continue
        }

        val comission = if(amount * percentComission > minComission) (amount * percentComission).toInt() else minComission
        println("Комиссия составит: $comission")
    }
}