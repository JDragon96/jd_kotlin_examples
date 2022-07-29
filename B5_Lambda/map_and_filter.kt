/*
1. filter, map
=> filter: 조건에 충족하는(true) 데이터만 남겨놓고 리턴한다.
=> 원래 collection에 false 객체를 제거

2. map
=> filter와 기능은 동일함
=> 단, 새로운 형태로 collection을 변경할 수 있다.

3. Dictionary 관련 람다함수
- filterValues
- mapValues 등등...
*/

data class Person(val name:String, val age: Int)

fun main(){
    // 1. filter
    val list = listOf(1, 2, 3, 4)
    println(list.filter{it % 2 == 0})

    // 2. map
    val people = listOf(Person("Alice", 10), Person("James", 20))
    println(people.filter{it.age < 15})

    val people2 = listOf(Person("Alice", 10), 
                         Person("James", 20), 
                         Person("D", 27))
    
    // 3. filter + map
    println(people.filter{it.age < 21}.map(Person::name))

    // 4. 
    val people3 = listOf(Person("Alice", 10), 
                         Person("James", 20), 
                         Person("D", 27))
    
    // !!은 null을 허용하지 않겠다는 의미
    val maxAge1 = people3.maxBy(Person::age)!!.age
    val maxAge2 = people3.maxBy(Person::age).age
    println(maxAge1)
    println(maxAge2)

    // 5. ㅁㄴㅇ
    val numbers = mapOf(0 to "one", 1 to "two")

    // mapOf()이기 때문에 새로운 Collection 생성
    //
    println(numbers.mapValues{it.value.toUpperCase()})
    println(numbers)
}