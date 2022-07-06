fun main(){
    // 1. Read-Only list
    val numbers: List<String> = listOf("One", "Two", "Three", "four")
    println(numbers.get(2))
    println(numbers.size)

    // 2. mutable List
    val mutableNumbers = mutableListOf(1, 2, 3, 4)

    // 맨 뒤에 값 추가
    mutableNumbers.add(5)

    // 특정 인덱스(1) 에 특정 값(10) 추가
    mutableNumbers.add(1, 10)

    // 특정 인덱스(3) 에 값(6,7,8) 추가
    mutableNumbers.addAll(3, listOf(6, 7, 8))

    // 특정 인덱스(1)의 값 제거
    mutableNumbers.removeAt(1)

    // 3이라는 요소를 제거한다.
    // 여러개의 동일 객체가 있으면, 맨 앞부터 제거한다.
    mutableNumbers.remove(3)
    println(mutableNumbers)
    
    // C스타일로 값 교체
    mutableNumbers[3] = 6
}