package ex

fun main(args: Array<String>) {
    /*
        В массиве хранится информация о массе каждого из 30 предметов, загру-
        жаемых в грузовой автомобиль, грузоподъемность которого известна. Оп-
        ределить, не превышает ли общая масса всех предметов грузоподъемность
        автомобиля.
    */

    val list = initIntList(30)

    println("Список масс предметов:")
    list.forEach { print("$it ") }
    println()

    println(isCapacityEnough(loadCapacity(), list.sum()))
}

fun loadCapacity(): Int {
    print("Введите грузоподъемность: ")
    return readln().toInt()
}

fun isCapacityEnough(capacity: Int,  totalWeight: Int):String =
    when {
        (capacity >= totalWeight) -> "Грузоподъемность достатаочная"
        else -> "Грузоподъемность не достатаочная"
    }
