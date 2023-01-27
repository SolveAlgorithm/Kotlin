package sunggil.level_0

fun main() {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        numbers.forEach { i ->
            answer += i
        }
        answer /= numbers.size
        return answer
    }
}