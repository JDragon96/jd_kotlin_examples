/*
수신 객체 지정 람다
=> 수신 객체를 명시하지 않고, 본문에서 다른 객체의 메소드 호출할 수 있게함

1. with
=> 특정 객체에 대한 연산을 적용, 최종 값을 return한다.

2. apply
=> 최종값이 아닌, 수신 객체 자체를 반환한다.

*/

// result 변수가 반복해서 사용 될 여지가 있어, 불편!
fun alphabet(): String{
    val result = StringBuilder()
    for(letter in 'A'..'Z'){
        result.append(letter)
    }

    result.append("\nNow I know the alphabet")
    return result.toString()
}

fun advanced_alphabet(): String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for(letter in 'A'..'Z'){
            this.append(letter)
        }
        this.append("\nNow I know the alphabet")
        this.toString()
    }
}

fun more_advanced_alphabet() = with(StringBuilder()){
    for(letter in 'A'..'Z'){
        this.append(letter)
    }
    this.append("\nNow I know the alphabet")
    this.toString()
}

fun apply_alphabet() = StringBuilder().apply{
    for(letter in 'A'..'Z'){
        this.append(letter)
    }
    this.append("\nNow I know the alphabet")
}.toString()

/////////////////////////////////////////
// Android에서 apply의 응용
/////////////////////////////////////////
/*
fun createViewWithCustomAttributes(context: Context) = 
    TextView(context).apply{
        text = "Sample text"
        textSize = 20.0
    }
*/

fun main(){
    println(alphabet())
    println(advanced_alphabet())
    println(more_advanced_alphabet())
    println(apply_alphabet())
}