class MinimumPathSum {

    private val memo = mutableMapOf<Pair<Int, Int>, Int>()

    fun minPathSum(grid: Array<IntArray>): Int {
        memo.clear()
        if (grid.isEmpty()) return 0
        return minPathSum(grid, 0, 0, 0)
    }

    private fun minPathSum(grid: Array<IntArray>, x: Int, y: Int, sum: Int): Int {
        val newSum = sum + grid[y][x]
        if (memo.containsKey(x to y)) {
            return memo[x to y]!! + newSum
        }
        val minimalRight = if (x < grid[0].size - 1) minPathSum(grid, x + 1, y, newSum) else -1
        val minimalDown = if (y < grid.size - 1) minPathSum(grid, x, y + 1, newSum) else -1

        return when {
            minimalDown >= 0 && minimalRight >= 0 -> Math.min(minimalDown, minimalRight)
            minimalDown < 0 && minimalRight < 0 -> newSum
            minimalDown < 0 -> minimalRight
            else -> minimalDown
        }.also {
            memo[x to y] = it - newSum
        }
    }
}