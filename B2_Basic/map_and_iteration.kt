// TreeMap : key에 대해서 sorting 해준다.

fun main(){
    val binaryReps = TreeMap<Char, String>();

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    
    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }
}