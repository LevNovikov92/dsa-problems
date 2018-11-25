import org.junit.Test

import org.junit.Assert.*

class Permutations2Test {

    @Test
    fun permuteUnique() {
        Permutations2().apply {
            assertEquals(listOf(listOf(1,1,2), listOf(1,2,1), listOf(2,1,1)), permuteUnique(intArrayOf(1,1,2)))
            assertEquals(listOf<List<Int>>(), permuteUnique(intArrayOf()))
            assertEquals(listOf(listOf(1)), permuteUnique(intArrayOf(1)))
        }

    }
}