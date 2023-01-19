package sunggil.level_0

fun main() {
    fun solution(money: Int): IntArray {
        val answer: IntArray = intArrayOf(0, 0)

        answer[0] = money / 5500
        answer[1] = money % 5500

        return answer
    }
}