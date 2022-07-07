/*
1. ?.
=> null이 아닌 경우 .*() 메소드 실행
=> null이면 null return

2. ?:
=> Elvis 연산자
>>> val t: String = s ?:""
=> s가 null이면 결과는 빈 문자열("")이 리턴된다.

3. as?
=> 안전한 형변환 연산자
>>> val otherPerson = o as? Person ?: return false

4. !!
=> null이 아님을 단언함
=> 대상이 null이면 예외를 던진다.

5. let 함수

*/

fun let_test(name: String){
    println("나의 이름은 $name")
}

fun main(){
    val name = "Jdragon"
    name?.let{
        let_test(it)
    }

    val name2 = null
    name2?.let{
        let_test(it)
    }
}