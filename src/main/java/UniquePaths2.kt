class UniquePaths2 {

    private val memo = mutableMapOf<Pair<Int, Int>, Int>()

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        memo.clear()
        if (obstacleGrid.isEmpty() || obstacleGrid[0][0] == 1 ||
                obstacleGrid[obstacleGrid.size - 1][obstacleGrid[0].size - 1] == 1) return 0
        return uniquePathsWithObstacles(obstacleGrid, 0, 0)
    }

    private fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>, x: Int, y: Int): Int {
        if (y == obstacleGrid.size - 1 && x == obstacleGrid[0].size - 1) return 1
        if (memo.containsKey(x to y)) return memo[x to y]!!

        return ((if (x + 1 <= obstacleGrid[0].size - 1 && obstacleGrid[y][x + 1] == 0) uniquePathsWithObstacles(obstacleGrid, x + 1, y) else 0) +
                (if (y + 1 > obstacleGrid.size - 1 && obstacleGrid[y + 1][x] == 0) uniquePathsWithObstacles(obstacleGrid, x, y + 1) else 0))
                .also {
                    memo[y to x] = it
                }
    }
}