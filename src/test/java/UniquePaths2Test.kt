import org.junit.Assert.assertEquals
import org.junit.Test

class UniquePaths2Test {

    @Test
    fun uniquePathsWithObstacles() {
        UniquePaths2().apply {
            assertEquals(0, uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0,0), intArrayOf(1,1), intArrayOf(0,0))))
            assertEquals(1, uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0), intArrayOf(0))))
            assertEquals(2, uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0,0,0), intArrayOf(0,1,0), intArrayOf(0,0,0))))
            assertEquals(1, uniquePathsWithObstacles(
                    arrayOf(intArrayOf(0,1,0,0), intArrayOf(0,1,0,0), intArrayOf(0,0,0,0))))
        }
    }
}