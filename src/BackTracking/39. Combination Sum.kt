package BackTracking

class Solution {
	var res = mutableListOf<MutableList<Int>>()

	fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
		helper(candidates, 0, target, mutableListOf())
		return res
	}

	private fun helper(candidates: IntArray, start: Int, target: Int, path: MutableList<Int>) {
		when {
			target < 0 -> return
			target == 0 -> res.add(path.toMutableList())
			else -> for(i in start until candidates.size) {
				path.add(candidates[i])
				helper(candidates, i , target - candidates[i], path)
				path.removeAt(path.size - 1)
			}
		}
	}
}
