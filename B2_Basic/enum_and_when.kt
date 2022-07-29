// Enum class에 property의 조합을 활용해, 값을 저장할 수 있다.
enum class Color(
    val r: Int, val g: Int, val b: Int
){
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    ORANGE(255, 165, 0), YELLOW(255, 255 ,0);

    fun rgb() = (r * 256 + g) * 256 + b
}

// when 메소드를 활용하여 Enum 타입 문류가 가능하다.
fun getMnemonic(color: Color) =
    when(color) {
        Color.RED -> "빨강"
        Color.GREEN -> "초록"
        Color.YELLOW -> "노랑"
        Color.ORANGE -> "오랜지"
        Color.BLUE -> "파랑"
    }

fun MultiCase(color: Color) =
    when(color){
        Color.RED, Color.GREEN, Color.YELLOW -> "하나"
        Color.BLUE -> "둘"
        Color.ORANGE -> "셋"
    }

fun MixCase(color1: Color, color2: Color) = 
    when(setOf(color1, color2)){
        setOf(Color.RED, Color.BLUE) -> "Section1"
        setOf(Color.GREEN, Color.YELLOW) -> "Section2"
        setOf(Color.ORANGE, Color.RED) -> "Section3"
        else -> throw Exception("Dirty Color")
    }

fun NoArgu(c1: Color, c2: Color) = 
    when{
        (c1 == Color.RED && c2 == Color.BLUE) ||
        (c1 == Color.YELLOW && c2 == Color.BLUE)
        -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.ORANGE)
        -> "Section2"
        else -> throw Exception("Dirty Color..")
    }

fun main(){
    println(Color.BLUE.rgb())
    //println(Color(100, 100, 100).rgb())
    println(getMnemonic(Color.RED))
    println(MultiCase(Color.RED))
    println(MixCase(Color.RED, Color.BLUE))
    println(NoArgu(Color.BLUE, Color.GREEN))
}