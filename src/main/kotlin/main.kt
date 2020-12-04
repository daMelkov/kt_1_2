// Cyrillic in console: Run/Edit Configuration/VM options: -Dfile.encoding=UTF-8

fun main() {
    val minComission = 3500
    val percentComission = .0075

    while(true) {
        print("Введите сумму перевода в копейках:")
        val amount = readLine()!!.toInt()

        if(amount < minComission) {
            println("Сумма недостаточна для перевода. Минимум: $minComission")
            continue
        }

        val comission = if(amount * percentComission > minComission) amount * percentComission else minComission
        println("Комиссия составит: $comission")

        print("Продолжить работу, y/n?:")
        if(readLine() == "n") {
            return
        }
    }
}