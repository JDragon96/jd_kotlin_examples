/*
1. Lazy collection

val result = books.asSequence()
                    .map(Book::title)
                    .filter{it.startsWith("s")}
                    .toList()

시퀀스에 대한 연산은 중간 연산 / 최종 연산으로 구분된다.
- 중간 연산 : 다른 시퀀스를 반환
- 최종 연산 : 결과를 반환

여기서 map, filter는 중간 연산자로써
중간 연산자는 항상 지연 호출된다.

따라서, toList()라는 최종 연산자를 적용하여 바로 연산되도록 유도

## 장점 ##
요소가 굉장히 많은 경우에 유용하게 사용됨
=> 최종 연산이 우선적으로 호출된다.
=> 모든 요소에 대해 연산이 되는 경우를 피할 수 있음

## 주의사항 ##
map 보다 filter를 먼저 적용하는 것이 바람직하다.

ex)
>>> listOf(1,2,3,4).asSequence().map{it * it}.find{it < 3}
>>> find는 최근접 요소만 뽑아내기 때문에, [3, 4]에 대한 연산을 생략해버림
*/
data class Person(val name:String, val age: Int)
data class Book(val title: String, val authors: List<String>)

fun main(){
    val books = listOf(Book("story1", listOf("JD", "YS", "MOON")),
                       Book("story2", listOf("JD", "MOON", "KIM")),
                       Book("story3", listOf("KIM")),
                       Book("story4", listOf("MOON", "KIM")))

    val result = books.asSequence()
                        .map(Book::title)
                        .filter{it.startsWith("s")}
                        .toList()
    println(result)
}