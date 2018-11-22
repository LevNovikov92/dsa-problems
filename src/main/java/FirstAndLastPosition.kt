class FirstAndLastPosition {

    /**
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     */
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val start = findStart(nums, target)
        val end = findEnd(nums, target, start)
        return intArrayOf(start, end)
    }

    private fun findStart(nums: IntArray, target: Int): Int {
        if (nums.size == 1) {
            return if (nums[0] == target) 0 else -1
        }
        var lo = 0
        var hi = nums.size - 1
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (target == nums[mid] && ((mid - 1) < 0 || nums[mid - 1] < target)) return mid
            if (lo == hi) return -1
            if (target <= nums[mid]) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        return -1
    }

    private fun findEnd(nums: IntArray, target: Int, start: Int): Int {
        if (start < 0) return -1
        var lo = start + 1
        var hi = nums.size - 1
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (target == nums[mid] && (mid == nums.size - 1 || nums[mid + 1] > target)) return mid
            if (lo == hi) return start
            if (target < nums[mid]) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        return start
    }
}