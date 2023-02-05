package sunggil.level_0

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    fun solution(hp: Int): Int {
        var general = 0 // 장군
        var soldier = 0 // 병정
        var work = 0 // 일병

        if(hp % 5 == 0) {
            general = hp / 5
        }

        general = hp / 5
        soldier = (hp % 5) / 3
        work = ((hp % 5) % 3) / 1

        return general + soldier + work
    }
}