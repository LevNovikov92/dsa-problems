class RotateImage {

    fun rotate(matrix: Array<IntArray>): Unit {

        for (i in 0 until matrix.size / 2) {
            rotateLayer(matrix, i)
        }
    }

    private fun rotateLayer(matrix: Array<IntArray>, i: Int) {
        val layerLength = matrix.size - 2 * i
        for (j in i until layerLength + i - 1) {
            var buffer = matrix[j][i + layerLength - 1]
            matrix[j][i + layerLength - 1] = matrix[i][j]

            val buffer1 = matrix[matrix.size - i - 1][matrix.size - j - 1]
            matrix[matrix.size - i - 1][matrix.size - j - 1] = buffer

            buffer = matrix[matrix.size - j - 1][i]
            matrix[matrix.size - j - 1][i] = buffer1

            matrix[i][j] = buffer
        }
    }
}