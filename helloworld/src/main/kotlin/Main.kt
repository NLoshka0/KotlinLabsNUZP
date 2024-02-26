fun seed(): String = "Nloshka0"

fun labNumber() : Int = 1

fun main(args: Array<String>) {
    println("Лабораторна робота № ${labNumber()} користувача ${seed()}")
    println(" ")
    //перший кіт
    var kitty = "Васько"
    kitty += " \uD83D\uDC31"
    val age = 7
    println("Кошеня №1 - $kitty віком $age років")

    //другий кіт
    val catName: String = "Мурзик \uD83D\uDC08"
    val weight: Float = 3.5f
    println("Кошеня №2 - $catName з вагою $weight кг")

    //третій кіт
    val catthreeName: String = "Рудий \uD83D\uDC06"
    val threeage = 6
    val cat3weight: Float = 8.2f
    println("Кошеня №3 - $catthreeName з вагою $cat3weight кг, та віком $threeage років")
}