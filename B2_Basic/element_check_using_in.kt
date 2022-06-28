fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(){
    println(isLetter('D'))
    println(isLetter('4'))
    println(isNotDigit('A'))
    println(isNotDigit('6'))

    println("Kotlin" in setOf("Java", "Python", "C++"))
}