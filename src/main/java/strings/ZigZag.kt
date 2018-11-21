package strings


/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 */

class ZigZag {
    fun convert(str: String, rows: Int): String {
        if (str.isEmpty() || rows == 0) return ""
        if (str.length == 1 || rows == 1) return str
        val matrix = Array(rows) { arrayOfNulls<Char>(columnsCount(str.length, rows)) }

        var x = 0
        var y = 0

        matrix[y][x] = str[0]
        for (i in 1 until str.length) {
            if (y == rows - 1) {
                y--
                x++
            } else if (y > 0 && matrix[y - 1][x] == null) { //rising
                x++
                y--
            } else {
                y++
            }
            matrix[y][x] = str[i]
        }
        val builder = StringBuilder()
        for (j in 0 until rows) {
            matrix[j].forEach { if (it != null) builder.append(it) }
        }
        return builder.toString()
    }

    private fun columnsCount(lettersCount: Int, rows: Int): Int {
        return (lettersCount / (rows + rows - 2) + 1) * (rows - 1)
    }


}