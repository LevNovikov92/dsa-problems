import org.junit.Test

import org.junit.Assert.*

class SpiralMatrixTest {

    @Test
    fun spiralOrder() {
        assertEquals(listOf(7,9,6), SpiralMatrix().spiralOrder(
                arrayOf(
                        intArrayOf(7),
                        intArrayOf(9),
                        intArrayOf(6)
                )
        ))
        assertEquals(listOf(1,2), SpiralMatrix().spiralOrder(
                arrayOf(
                        intArrayOf(1,2)
                )
        ))
        assertEquals(listOf(1,2), SpiralMatrix().spiralOrder(
                arrayOf(
                        intArrayOf(1),
                        intArrayOf(2)
                )
        ))
        assertEquals(listOf(1,2,3,4,8,12,11,10,9,5,6,7), SpiralMatrix().spiralOrder(
                arrayOf(
                        intArrayOf(1,2,3,4),
                        intArrayOf(5,6,7,8),
                        intArrayOf(9,10,11,12)
                )
        ))
        assertEquals(listOf(1,2,3,6,9,8,7,4,5), SpiralMatrix().spiralOrder(
                arrayOf(
                        intArrayOf(1,2,3),
                        intArrayOf(4,5,6),
                        intArrayOf(7,8,9)
                )
        ))
    }
}