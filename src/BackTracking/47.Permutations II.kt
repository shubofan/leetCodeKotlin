package BackTracking

class Solution {
	val res = mutableListOf<MutableList<Int>>()

	fun permuteUnique(nums: IntArray): List<List<Int>> {
		nums.sort()
		var visited = BooleanArray(nums.size){false}
		helper(nums, mutableListOf(), visited)
		return res
	}
	private fun helper(nums: IntArray, tem: MutableList<Int>, visited:BooleanArray) {
		when {
			nums.size == tem.size -> res.add(tem.toMutableList())
			else -> for(i in nums.indices) {
				if(i > 0 && nums[i] == nums[i - 1]  && !visited[i - 1] || visited[i]) continue
				tem.add(nums[i])
				visited[i] = true
				helper(nums, tem, visited)
				tem.removeAt(tem.size - 1)
				visited[i] = false
			}
		}
	}
}