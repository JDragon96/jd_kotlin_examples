/*
1. any, all
=> 어떤 원소가 조건을 만족하는가 판단할 때 사용

2. count
=> 특정 조건을 만족하는 요소 개수를 리턴한다.

3. find
=> 특정 조건을 만족하는 객체를 하나 반환
=> 없으면 null 리턴
=> firstOrNull과 동일

*/
data class Person(val name:String, val age: Int)

fun main(){
    val people = listOf(Person("Alice", 10), 
    Person("James", 20), 
    Person("D", 27),
    Person("F", 27))
    
    val canBeInClub27 = {p: Person -> p.age <= 27}

    // 해당 Collection의 모든 요소의 age가 27이하인가?
    println(people.all(canBeInClub27))

    // Collection의 원소 중 age가 20 미만인 것이 하나라도 존재하는가
    println(people.any({p: Person -> p.age < 20}))

    // 조건을 만족하는 요소 개수
    println(people.count(canBeInClub27))

    // 조건을 만족하는 요소 찾기
    // 하나만 리턴함(가장 앞에 있는 요소로)
    println(people.find({p: Person -> p.age == 27}))
    println(people.firstOrNull({p: Person -> p.age == 27}))
}