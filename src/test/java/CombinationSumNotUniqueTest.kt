import org.junit.Test

import org.junit.Assert.*

class CombinationSumNotUniqueTest {

    @Test
    fun combinationSum() {
        CombinationSumNotUnique().apply {
//            assertEquals(listOf(listOf(7), listOf(2,2,3)), combinationSum(intArrayOf(2,3,6,7), 7))
            assertEquals(listOf(listOf(2,2,2,2), listOf(2,3,3), listOf(3,5)),
                    combinationSum(intArrayOf(2,3,5), 8))
        }
    }
}