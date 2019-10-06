package BackTracking

class Solution {
	fun exist(board: Array<CharArray>, word: String): Boolean {
		var row = board.size
		var col = board[0].size
		var used = Array(row){BooleanArray(col)}

		for(i in 0 until row){
			for(j in 0 until col) {
				if (search(board, word, used, i, j, 0)) {
					return true;
				}
			}
		}
		return false
	}

	private fun search(board: Array<CharArray>, word: String, used: Array<BooleanArray>, x: Int, y:Int, i:Int): Boolean {
		if(i == word.length) return true
		if(x == board.size || y == board[0].size || x < 0 || y < 0) return false
		if(used[x][y]) return false
		if(word[i] != board[x][y]) return false
		used[x][y] = true
		var res = search(board, word, used, x + 1, y, i + 1) || search(board, word, used, x - 1, y, i + 1) || search(board, word, used, x, y + 1, i + 1) ||search(board, word, used, x, y - 1, i + 1)
		used[x][y] = false
		return res
	}
}
