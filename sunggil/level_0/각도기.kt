package sunggil.level_0

fun main() {
    fun solution(angle: Int): Int {
        val answer: Int = 0
        if(angle < 90) {
            return 1
        } else if (angle == 90) {
            return 2
        } else if (angle in 91..179) {
            return 3
        } else if (angle == 180) {
            return 4
        }
        return answer
    }
}