package BackTracking

class Solution {
	val res = mutableListOf<MutableList<Int>>()

	fun subsetsWithDup(nums: IntArray): List<List<Int>> {
		nums.sort()
		helper(nums, 0, mutableListOf<Int>())
		return res
	}

	private fun helper(nums: IntArray, start: Int, subset: MutableList<Int>) {
		res.add(subset.toMutableList())
		if(start == nums.size) return

		for(i in start until nums.size) {
			if(i != start && nums[i] == nums[i - 1]) continue
			subset.add(nums[i])
			helper(nums, i + 1, subset)
			subset.removeAt(subset.size - 1)
		}
	}
}
