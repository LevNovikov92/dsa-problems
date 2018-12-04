import org.junit.Test

import org.junit.Assert.*

class MinimumPathSumTest {

    @Test
    fun minPathSum() {
        MinimumPathSum().apply {
            assertEquals(0, minPathSum(arrayOf()))
            assertEquals(8, minPathSum(
                    arrayOf(
                            intArrayOf(1,3,1,4),
                            intArrayOf(1,5,1,2),
                            intArrayOf(4,2,1,1)
                    ))
            )
            assertEquals(7, minPathSum(
                    arrayOf(
                            intArrayOf(1,3,1),
                            intArrayOf(1,5,1),
                            intArrayOf(4,2,1)
                    ))
            )
            assertEquals(6, minPathSum(
                    arrayOf(
                            intArrayOf(1),
                            intArrayOf(1),
                            intArrayOf(4)
                    ))
            )
            assertEquals(6, minPathSum(arrayOf(intArrayOf(1,1,4))))
        }
    }
}