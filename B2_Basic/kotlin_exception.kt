fun main(){
    val percentage: Int = 10

    if(percentage !in 0..100){
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: $percentage"
        )
    }

    val number: Int = 5
    val newPercentage =
        if (number in 0..100) number
        else{
            throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $number"
            )
        }
}