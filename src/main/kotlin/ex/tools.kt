package ex

import kotlin.random.Random

fun initIntList(maxRange:Int = 100): MutableList<Int>{
    val result = mutableListOf<Int>()
    for (i in 0..maxRange - 1){
        result.add(Random.nextInt(100))
    }
    return result
}
