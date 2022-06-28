fun main(){
    val number = try{
        // Integer.parseInt(reader.readLine())
        "5" is Int
    } catch(e: NumberFormatException){
        return
    }
    println(number)
}