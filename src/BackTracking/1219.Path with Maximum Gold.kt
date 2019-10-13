package BackTracking


class Solution {
	var res = 0
	fun getMaximumGold(grid: Array<IntArray>): Int {
		val row = grid.size
		val col = grid[0].size
		var used = Array(row){BooleanArray(col)}
		for(i in 0 until row){
			for(j in 0 until col) {
				helper(grid, 0, i, j, row, col, used)
			}
		}
		return res
	}

	private fun helper(grid: Array<IntArray>, cur: Int, x: Int, y: Int, row: Int, col: Int, used: Array<BooleanArray>) {
		if(x == row || y == col || x < 0 || y < 0 || used[x][y] || grid[x][y] == 0) {
			res = maxOf(res, cur)
			return
		}
		used[x][y] = true
		helper(grid, cur + grid[x][y], x + 1, y, row, col, used)
		helper(grid, cur + grid[x][y], x - 1, y, row, col, used)
		helper(grid, cur + grid[x][y], x, y + 1, row, col, used)
		helper(grid, cur + grid[x][y], x, y - 1, row, col, used)
		used[x][y] = false
	}
}
