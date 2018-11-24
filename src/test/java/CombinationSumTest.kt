import org.junit.Test

import org.junit.Assert.*

class CombinationSumTest {

    @Test
    fun combinationSum() {
        CombinationSum().apply {
            assertEquals(
                    listOf(
                            listOf(1, 7),
                            listOf(1, 2, 5),
                            listOf(2, 6),
                            listOf(1, 1, 6)
                    ),
                    combinationSum(
                            intArrayOf(10,1,2,7,6,1,5),
                            8
                    )
            )
        }
    }
}