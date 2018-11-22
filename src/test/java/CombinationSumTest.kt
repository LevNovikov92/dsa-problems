import org.junit.Test

import org.junit.Assert.*

class CombinationSumTest {

    @Test
    fun combinationSum() {
        CombinationSum().apply {
            assertEquals(listOf(listOf(7)), combinationSum(intArrayOf(2,3,6,7), 7))
            assertEquals(listOf(listOf(2,3,2), listOf(7)), combinationSum(intArrayOf(2,3,6,2,7), 7))
            assertEquals(listOf(listOf(1,3,6), listOf(3,7), listOf(6,4)),
                    combinationSum(intArrayOf(1,3,6,4,7), 10))
        }
    }
}