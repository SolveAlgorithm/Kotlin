package sunggil.level_0

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val number = readLine().toInt()
    var oddNumber = 1

    val answer = IntArray(count(number))

    for(i in 0 until count(number)) {
        answer[i] = oddNumber
        oddNumber += 2
    }

    println(answer.contentToString())

}

fun count(number: Int): Int {
    return if(number % 2 == 0) number / 2
    else number / 2 + 1
}

