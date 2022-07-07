/*
".*" : 문자 0개 이상을 의미한다.
=> ".code" : code로 끝나는 문자열과 일치함



*/
fun main(){
    val path = "https://naver.com"
    val regex = "https://(.+)".toRegex()
    isMatch(path, regex)

    example1()
}
fun isMatch(path: String, regex: Regex) {
    if (path.matches(regex)) println("match")
    else println("not match")
}

fun example1(){
    println("1번 예제")
    val str: String = "Welcome to korea"
    val regex = Regex(".to")
    println(str.matches(regex))
}