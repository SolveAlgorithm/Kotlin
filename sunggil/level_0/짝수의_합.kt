package sunggil.level_0

fun main() {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val count = n / 2
        var incrementTwo = 0

        for (i in 1..count) {
            incrementTwo += 2
            answer += incrementTwo
        }

        return answer
    }
}