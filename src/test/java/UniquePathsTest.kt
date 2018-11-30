import org.junit.Test

import org.junit.Assert.*

class UniquePathsTest {
    @Test
    fun uniquePaths() {
        UniquePaths().apply {
            assertEquals(0, uniquePaths(0, 0))
            assertEquals(3, uniquePaths(3, 2))
            assertEquals(6, uniquePaths(3, 3))
            assertEquals(28, uniquePaths(7, 3))
        }
    }

}