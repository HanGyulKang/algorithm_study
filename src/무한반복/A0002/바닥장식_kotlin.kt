package 무한반복.A0002

import java.io.*
import java.util.StringTokenizer

object 바닥장식_kotlin {
    private var ROW = 0
    private var COL = 0
    private lateinit var map: Array<CharArray>
    private var answer = 0

    private fun dfs(row: Int, col: Int) {
        val currentFloor = map[row][col]
        map[row][col] = 'x'

        if (currentFloor == '-' && map[row][col + 1] == '-') {
            dfs(row, col + 1)
        }

        if (currentFloor == '|' && map[row + 1][col] == '|') {
            dfs(row + 1, col)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        val st = StringTokenizer(br.readLine())
        ROW = st.nextToken().toInt()
        COL = st.nextToken().toInt()

        if (ROW == 1 && COL == 1) {
            answer = 1
        } else {
            map = Array(ROW + 2) { CharArray(COL + 2) }

            for (i in 1..ROW) {
                val floor = br.readLine()
                for (j in 1..COL) {
                    map[i][j] = floor[j - 1]
                }
            }

            for (i in 1..ROW) {
                for (j in 1..COL) {
                    if (map[i][j] != 'x') {
                        answer++
                        dfs(i, j)
                    }
                }
            }
        }

        bw.write(answer.toString())
        br.close()
        bw.close()
    }
}
