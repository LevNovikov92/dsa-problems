import org.junit.Test

import org.junit.Assert.*

class JumpGameTest {

    @Test
    fun canJump() {
        JumpGame().apply {
            assertTrue(canJump(intArrayOf(2,3,1,1,4)))
            assertTrue(canJump(intArrayOf()))
            assertTrue(canJump(intArrayOf(1)))
            assertFalse(canJump(intArrayOf(3,2,1,0,4)))
            assertTrue(canJump(intArrayOf(2,5,1,10,4)))
            assertTrue(canJump(intArrayOf(2,5,0,0)))
        }
    }
}