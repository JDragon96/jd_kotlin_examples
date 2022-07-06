class User(val name: String){
    var address: String = "unspecified"
        set(value: String){
            println("""
            주소가 변경되었습니다 $name:
            "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(){
    val user = User("Alice")
    user.address = "대전 석봉동"
}