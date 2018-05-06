package trees

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class SearchInsertPositionTest {
    @Test
    fun searchInsertPosition() {
        val test = SearchInsertPosition()
        test.run {
            Assert.assertEquals(2, searchInsertPosition(intArrayOf(1,3,5,6), 5))
            Assert.assertEquals(1, searchInsertPosition(intArrayOf(1,3,5,6), 2))
            Assert.assertEquals(0, searchInsertPosition(intArrayOf(1,3,5,6), 0))
            Assert.assertEquals(4, searchInsertPosition(intArrayOf(1,3,5,6), 7))

            Assert.assertEquals(0, searchInsertPosition(intArrayOf(2, 3, 4, 8, 10), 0))
            Assert.assertEquals(1, searchInsertPosition(intArrayOf(3, 4, 9, 10), 5))
            Assert.assertEquals(1, searchInsertPosition(intArrayOf(1, 3), 2))
//            Assert.assertEquals(1, searchInsertPosition(intArrayOf(1,3,5,6), 2))
//            Assert.assertEquals(0, searchInsertPosition(intArrayOf(1,3,5,6), 0))
//            Assert.assertEquals(4, searchInsertPosition(intArrayOf(1,3,5,6), 7))
        }
    }

}