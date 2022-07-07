////////////////////////////////////////////////
/// 1번 예제
////////////////////////////////////////////////
enum class Delivery{STANDARD, EXPEDITED}
class Order(val itemCount: Int)

fun getShippingCostCalculator(
    delivery: Delivery
): (Order) -> Double{
    
    if(delivery == Delivery.EXPEDITED){
        return {order -> 6 + 2.1 * order.itemCount}
    }
    return {order -> 1.2 * order.itemCount}
}


////////////////////////////////////////////////
/// 2번 예제
////////////////////////////////////////////////
enum class OS {WINDOWS, LINUX, MAC, IOS, ANDROID}

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

fun List<SiteVisit>.averageDuration(os: OS) = 
    filter{it.os == os}.map(SiteVisit::duration).average()



////////////////////////////////////////////////
/// 3번 예제
/// 람다의 부가비용 없애기(인라인 함수)
/// 인라인 조건 : 변수 타입을 명확하게 알 때
////////////////////////////////////////////////
// TODO:: 추후 작성하기

fun main(){
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println(calculator?.invoke(Order(5)))

    val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 3.0, OS.LINUX),
        SiteVisit("/login", 4.0, OS.MAC),
        SiteVisit("/signup", 14.0, OS.IOS),
        SiteVisit("/", 51.0, OS.WINDOWS),
    )
    
    // 1. 람다함수를 이용한 평균 계산
    println(log.filter{it.os == OS.WINDOWS}
                .map(SiteVisit::duration)
                .average()) 

    // 2. 함수 리턴으로 처리
    // 고차 함수(함수에 함수)를 사용해 중복을 제거한다.
    println(log.averageDuration(OS.WINDOWS))
}