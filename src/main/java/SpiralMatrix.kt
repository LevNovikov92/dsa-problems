class SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val list = mutableListOf<Int>()
        if (matrix.isEmpty()) return emptyList()
        if (matrix.size == 1) return matrix[0].toList()
        if (matrix[0].size == 1) {
            matrix.forEach { list.add(it[0]) }
            return list
        }
        for (i in 0 until Math.min(matrix.size, matrix[0].size).let { it / 2 + it % 2 }) {
            writeLayer(matrix, i, list)
        }
        return list
    }

    //1,2,3,4,5,6
    //1,2,3,4,5,6
    //1,2,3,4,5,6
    //1,2,3,4,5,6
    //1,2,3,4,5,6
    //1,2,3,4,5,6
    private fun writeLayer(matrix: Array<IntArray>, index: Int, list: MutableList<Int>) {
        val endIndexX = matrix[0].size - index - 1
        val endIndexY = matrix.size - index - 1
        if (endIndexX == index && endIndexY == index) {
            list.add(matrix[index][index])
            return
        }
        for (i in index .. endIndexX) {
            list.add(matrix[index][i])
        }

        for (i in index + 1 .. endIndexY) {
            list.add(matrix[i][endIndexX])
        }

        for (i in endIndexX - 1 downTo index + 1) {
            list.add(matrix[endIndexY][i])
        }

        for (i in endIndexY downTo index + 1) {
            list.add(matrix[i][index])
        }
    }
}