import org.junit.Test

import org.junit.Assert.*

class SpiralMatrix2Test {

    @Test
    fun generateMatrix() {
        SpiralMatrix2().apply {
            assertEquals(
                    arrayOf(
                            intArrayOf(1,2,3),
                            intArrayOf(8,9,4),
                            intArrayOf(7,6,5)
                    ), generateMatrix(3))
            assertEquals(
                    arrayOf(
                            intArrayOf(1, 2, 3, 4),
                            intArrayOf(12,13,14,5),
                            intArrayOf(11,16,15,6),
                            intArrayOf(10,9, 8, 7)
                    ), generateMatrix(4))
            assertEquals(emptyArray(), generateMatrix(0))
            assertEquals(emptyArray(), generateMatrix(-1))
        }
    }
}