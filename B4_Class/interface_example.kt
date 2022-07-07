///////////////////////////////////////////
// 인터페이스에서 중복된 메소드 오버로딩
interface Clickable{
    fun Click()
    fun showOff() = println("Im Clickable")
}

interface Focusable{
    fun setFocus(b: Boolean) = 
        println("포커스를 맞춥니다.")
    fun showOff() = println("포커스입니다.")
}

class Button: Clickable, Focusable{
    override fun Click() = println("클릭 오버라이딩 완료")

    // 1. showOff() 호출 시 모두 실행된다.
    // override fun showOff(){
    //     super<Clickable>.showOff()
    //     super<Focusable>.showOff()
    // }
    
    // 2. 하나만 상속받는 방법
    override fun showOff() = super<Clickable>.showOff()
}

////////////////////////////////////
// final 키워드의 효과(부모의 final은 자식에서 상속 불가)
open class RichButton: Clickable{
    // final이기 때문에, 하위 클래스에서 상속 불가
    fun disable() {}

    // open, override는 상속 가능
    open fun aimate() {}
    override fun showOff() {}
}

abstract class Animated{
    // 추상 메소드는 반드시 상속해야 한다
    abstract fun animate()

    // 비추상 함수는 기본적으로 final이다.
    open fun stopAnimate() {}
    fun animateTwice() {} 
}

//////////////////////////////
// Interface의 프로퍼티 구현
interface User{
    val nickname: String
}

// 1. 주 생성자에서 프로퍼티 오버로딩
class PrivateUser(override val nickname: String): User
// 2. 커스텀 게터
class SubscribingUser(val email: String): User{
    override val nickname: String
        get() = email.substringBefore('@')
}
class FacebookUser(val accountId: Int): User{
    override val nickname = getFacebookName(accountId)
}

fun main(){
    val btn: Button = Button()
    btn.Click()

    // 동일한 이름의 메소드가 모두 실행되어버린다.
    btn.showOff()
}