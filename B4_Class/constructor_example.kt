/*
주 생성자(primary constructor)
- 클래스 초기화 시 사용
- 본문 밖에 정의되어 있다.

부 생성자(secondary constructor)
- 클래스 본문 안에 위치
*/

// 주 생성자(_name: String ...)와 프로퍼티 정의의 분리
class Person(_name: String, _age: Int){
    val name = _name
    val age = _age
}

// 주 생성자에서 프로퍼티까지 동시 생성하는 방법
class User(val nickName: String)

open class Layer1(val name: String){
    fun CallLayer1(){println(name)}
}
// 기반 클래스까지 한번에 초기화 하는 방법
class Layer2(nickname: String): Layer1(nickname) {

}

fun main(){
    val layer2 = Layer2("jd")
    layer2.CallLayer1()
}