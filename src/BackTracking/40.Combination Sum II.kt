package BackTracking

class Solution {
	var res = mutableListOf<MutableList<Int>>()

	fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
		candidates.sort()
		helper(candidates, 0, target, mutableListOf())
		return res
	}

	private fun helper(candidates: IntArray, start: Int, target: Int, path: MutableList<Int>) {
		when {
			target < 0 -> return
			target == 0 -> res.add(path.toMutableList())
			else -> for(i in start until candidates.size) {
				if(i > start && candidates[i] == candidates[i - 1]) continue
				path.add(candidates[i])
				helper(candidates, i + 1 , target - candidates[i], path)
				path.removeAt(path.size - 1)
			}
		}
	}
}
