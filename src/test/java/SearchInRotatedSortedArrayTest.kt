import org.junit.Test

import org.junit.Assert.*

class SearchInRotatedSortedArrayTest {

    @Test
    fun search() {
        SerachInRotatedSortedArray().apply {
            assertEquals(4, search(intArrayOf(4,5,6,7,0,1,2), 0))
            assertEquals(0, search(intArrayOf(0,1,2,4,5,6,7), 0))
            assertEquals(6, search(intArrayOf(1,2,4,5,6,7,0), 0))
        }
    }
}