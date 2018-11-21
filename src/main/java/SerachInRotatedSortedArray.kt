class SerachInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return  -1
        if (nums[0] == target) return  0
        var lo = 0
        var hi = nums.size - 1
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            if (nums[mid] == target) return mid
            if (nums[lo] == target) return lo
            if (nums[hi] == target) return hi
            if (nums[lo] < nums[mid]) {
                if (target >= nums[lo] && target <= nums[mid]) {
                    hi = mid
                } else {
                    lo = mid + 1
                }
            } else {
                if (target >= nums[mid] && target <= nums[hi]) {
                    lo = mid +1
                } else {
                    hi = mid
                }
            }
        }
        return -1
    }
}