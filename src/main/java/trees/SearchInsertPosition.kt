package trees

class SearchInsertPosition {

    fun searchInsertPosition(arr: IntArray, number: Int): Int {
        return searchPosition(0, arr.size - 1, arr, number)
    }

    private fun searchPosition(from: Int, to: Int, arr: IntArray, number: Int): Int {
        val mid = from + (to - from) / 2
        if (arr[mid] == number) return mid

        return if (from == to) {
            if (number > arr[mid]) {
                mid + 1
            } else {
                if (mid - 1 == 0) mid else Math.max(0, mid - 1)
            }
        } else {
            if (arr[mid] > number) {
                searchPosition(from, if (mid - 1 < from) from else mid - 1, arr, number)
            } else {
                searchPosition(if (mid + 1 > to) to else mid + 1, to, arr, number)
            }
        }
    }
}