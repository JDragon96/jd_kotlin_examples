/*
1. flatMap

2. flatten

*/
data class Person(val name:String, val age: Int)
data class Book(val title: String, val authors: List<String>)

fun main(){
    val books = listOf(Book("story1", listOf("JD", "YS", "MOON")),
                       Book("story1", listOf("JD", "MOON", "KIM")))

    println(books.flatMap{it.authors}.toSet())
}