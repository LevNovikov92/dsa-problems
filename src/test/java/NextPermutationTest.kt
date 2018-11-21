import org.junit.Test

import org.junit.Assert.*

class NextPermutationTest {

    @Test
    fun nextPermutation() {
        NextPermutation().apply {
            // 1,1,5,5,5 -> 1,5,1,5,5
            // 1,1,5,4,3 -> 1,3,1,4,5
            assertArrayEquals(intArrayOf(1,5,1,5,5), intArrayOf(1,1,5,5,5).also { nextPermutation(it) })
            assertArrayEquals(intArrayOf(1,3,1,4,5), intArrayOf(1,1,5,4,3).also { nextPermutation(it) })
            assertArrayEquals(intArrayOf(1,5,3,4,4), intArrayOf(1,4,5,4,3).also { nextPermutation(it) })
        }
    }
}