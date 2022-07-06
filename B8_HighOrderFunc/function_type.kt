val sum: (Int, Int) -> Int = {x, y -> x + y}
val action: () -> Unit = {println(42)}

fun twoAndThree(operation: (Int, Int) -> Int){
    val result = operation(2, 3)
    println(result)
}

// 대문자 변환기
fun String.myUpper(isAlphabet: (Char) -> Boolean): String{
    val sb = StringBuilder()
    for(index in 0 until this.length){
        val element = this.get(index)
        if(isAlphabet(element)) sb.append(element.uppercaseChar())
    }
    return sb.toString()
}

// joinToString 예제
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: ((T)-> String)? = null
): String {
    val result = StringBuilder()

    result.append(prefix)
    for((index, element) in this.withIndex()){
        if(index > 0) result.append(separator)
        // invoke를 통한 안전한 메소드 호출
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)

    return result.toString()
}

fun main(){
    println(sum(10,20))
    twoAndThree({x, y -> x + y})

    val tempString = "ab123dc"
    println(tempString.myUpper({it in 'A'..'Z' || it in 'a'..'z'}))
    
    val alpha = listOf("1", "d", "d", 3, "g")
    println(alpha.joinToString(transform={it.toString()}))
}