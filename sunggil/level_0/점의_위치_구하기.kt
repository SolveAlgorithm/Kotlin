package sunggil.level_0

fun main() {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0
        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1
        }
        if(dot[0] < 0 && dot[1] > 0) {
            answer = 2
        }
        if(dot[0] < 0 && dot[1] < 0) {
            answer = 3
        }
        if(dot[0] > 0 && dot[1] < 0) {
            answer = 4
        }
        return answer
    }
}