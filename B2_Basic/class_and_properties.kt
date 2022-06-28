// JAVA에서 클래스 정의
// public class Person{
//     private final String name;

//     public Person(String name){
//         this.name = name
//     }
//     ...
// }

// val인 name은 getter만 제공
// var인 isMarried는 get/set 모두 제공
class Person(val name: String, var isMarried: Boolean)

// 1. Primary Constructor
// => Praimary Constructor에서 정의된 객체는 객체 전역에서 정의가능
// 2. Secondary Constructor
// => constructor 키워드 이용

fun main(){
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}