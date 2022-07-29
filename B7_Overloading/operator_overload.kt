data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point): Point{
        return Point(x + other.x, y + other.y)
    }
    
    operator fun Point.plus(other: Point): Point{
        return Point(x + other.x, y + other.y)
    }
}

fun main(){
    val p1 = Point(1, 10)
    val p2 = Point(2, 13)
    println(p1 + p2)
    println(p1.plus(p2))
}