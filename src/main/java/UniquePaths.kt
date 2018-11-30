class UniquePaths {

    fun uniquePaths(m: Int, n: Int): Int {
        return uniquePaths(m, n , 0, 0)
    }

    private fun uniquePaths(m: Int, n: Int, x: Int, y: Int): Int {
        if (m <= 0 || n <= 0) return 0
        return when {
            x == m - 1 -> 1
            y == n - 1 -> 1
            else -> uniquePaths(m, n, x + 1, y) + uniquePaths(m, n, x, y + 1)
        }
    }
}