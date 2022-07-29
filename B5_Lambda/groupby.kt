/*
1. groupBy
=> 특정 조건을 만족하는 그룹끼리 map으로 묶는다.

*/
data class Person(val name:String, val age: Int)

fun main(){
    val people = listOf(Person("Alice", 10), 
    Person("James", 20), 
    Person("D", 27),
    Person("F", 27))
 
    println(people.groupBy{it.age})

}