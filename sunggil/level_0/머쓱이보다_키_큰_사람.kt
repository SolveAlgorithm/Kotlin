package sunggil.level_0

fun main() {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0

        array.forEach {
            if(it > height) answer ++
        }

        return answer
    }
}