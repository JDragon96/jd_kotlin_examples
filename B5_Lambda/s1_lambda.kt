/*
1. 람다식의 문법
{x: Int, y: Int -> x + y}
- x:, y: 는 파라미터
- x + y 는 본문
- 파라미터와 본문이 중괄호 사이에 위치한다.



*/

class Person(val name:String, val age: Int)

// fun <T> Collection<T>.joinToString(
//     separator:Sting = " ",
//     item: String): String
//     {
//         val result = StringBuilder("")
//         for ((index, element) in this.withIndex()){
//             if(index > 0) result.append(separator)
//             result.append(element)
//         }
//         return result
//     }
fun LambdaExample(){
    val people = listOf(Person("Alice", 30), Person("James", 25))
    println(people.maxBy{it.age}.name)
    println(people.maxBy({p: Person -> p.age}).name)
    println(people.maxBy(){p:Person -> p.age}.name)
}

fun LambdaSaveInVal(){
    //람다 저장 시 요소의 타입을 명시해야 한다.
    val people = listOf(Person("Alice", 30), Person("James", 25))
    val getAge = {p: Person -> p.age}
    println(people.maxBy(getAge).name)
}

fun LambdaInFunction(
    message: Collection<String>,
    prefix: String){
    // 함수 파라미터(prefix)를 람다 속(forEach)에서 사용하기
    message.forEach{
        println("$prefix $it")
    }
}


fun <T> Collection<T>.TEST(filter){
    
}

fun main(){
    LambdaExample()
    LambdaSaveInVal()

    val errors = listOf("403 Forbidden", "404 Not Found")
    LambdaInFunction(errors, "Error :")

    errors.TEST()
}