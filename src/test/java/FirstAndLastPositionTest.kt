import org.junit.Test

import org.junit.Assert.*

class FirstAndLastPositionTest {

    @Test
    fun searchRange() {
        FirstAndLastPosition().apply {
            assertArrayEquals(intArrayOf(0,2), searchRange(intArrayOf(3,3,3), 3))
            assertArrayEquals(intArrayOf(0,1), searchRange(intArrayOf(2,2), 2))
            assertArrayEquals(intArrayOf(5,5), searchRange(intArrayOf(5,7,7,8,8,10), 10))
            assertArrayEquals(intArrayOf(0,0), searchRange(intArrayOf(5,7,7,8,8,10), 5))
            assertArrayEquals(intArrayOf(0,0), searchRange(intArrayOf(5), 5))
            assertArrayEquals(intArrayOf(-1,-1), searchRange(intArrayOf(5), 6))
            assertArrayEquals(intArrayOf(3,4), searchRange(intArrayOf(5,7,7,8,8,10), 8))
            assertArrayEquals(intArrayOf(-1,-1), searchRange(intArrayOf(5,7,7,8,8,10), 9))
        }
    }
}