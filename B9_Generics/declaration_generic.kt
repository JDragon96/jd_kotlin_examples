/// 1. 제너릭 파라미터의 제약
fun <T: Number> oneHalf(value: T): Double =
    return value.toDouble() / 2.0

fun main(){
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
}