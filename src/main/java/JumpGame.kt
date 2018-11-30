class JumpGame {

    lateinit var memo: IntArray

    fun canJump(nums: IntArray): Boolean {
        if (nums.isEmpty()) return true
        memo = IntArray(nums.size)
        return canJump(nums, 0)
    }

    private fun canJump(nums: IntArray, index: Int): Boolean {
        if (memo[index] != 0) return memo[index] > 0
        if (index == nums.size - 1) return true
        if (nums[index] == 0) return false

        for (i in 1..nums[index]) {
            if (canJump(nums, index + i)) {
                memo[index] = 1
                return true
            }
        }
        memo[index] = -1
        return false
    }
}