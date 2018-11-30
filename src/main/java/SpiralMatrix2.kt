class SpiralMatrix2 {

    fun generateMatrix(n: Int): Array<IntArray> {
        if (n <= 0) return emptyArray()

        val result = Array(n) { _ -> IntArray(n) }

        var x = 0
        var y = 0
        var v = 1

        result[0][0] = 1
        while (true) {
            var noWay = true

            //go right
            while (x + 1 < n && result[y][x + 1] == 0) {
                noWay = false
                x++
                v++
                result[y][x] = v
            }

            //go down
            while (y + 1 < n && result[y + 1][x] == 0) {
                noWay = false
                y++
                v++
                result[y][x] = v
            }

            //go left
            while (x - 1 >= 0 && result[y][x - 1] == 0) {
                noWay = false
                x--
                v++
                result[y][x] = v
            }

            //go top
            while (y - 1 >= 0 && result[y - 1][x] == 0) {
                noWay = false
                y--
                v++
                result[y][x] = v
            }

            if (noWay) return result
        }
    }
}