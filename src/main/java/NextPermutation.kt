import java.util.*

class NextPermutation {


    // 1,1,5,5,5 -> 1,5,1,5,5
    // 1,1,5,4,3 -> 1,3,1,4,5
    // 1,4,5,4,3 -> 1,5,3,4,4

    fun nextPermutation(nums: IntArray): Unit {
        if (nums.size <= 1) return
        val s1 = firstDecreasingIndex(nums)
        if (s1 < 0) {
            rearrangeAsc(nums)
        } else {
            val s2 = lowestFromLeft(nums, s1)
            val n1 = nums[s1]
            nums[s1] = nums[s2]
            nums[s2] = n1
            sortAsMin(nums, s1 + 1)
        }
    }

    private fun sortAsMin(nums: IntArray, fromIndex: Int) {
        Arrays.sort(nums, fromIndex, nums.size)
    }

    private fun lowestFromLeft(nums: IntArray, s1: Int): Int {
        var lowest = s1 + 1
        for (i in s1 + 1 until nums.size) {
            if (nums[i] < nums[lowest] && nums[i] > nums[s1]) {
                lowest = i
            }
        }
        return lowest
    }

    private fun rearrangeAsc(nums: IntArray) {
        Arrays.sort(nums)
    }

    private fun firstDecreasingIndex(nums: IntArray): Int {
        for (i in nums.size - 2 downTo 0) {
            if (nums[i] < nums[i + 1]) return i
        }
        return -1
    }
}