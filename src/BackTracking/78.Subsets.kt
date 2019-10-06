package BackTracking

class Solution {
	val res = mutableListOf<MutableList<Int>>()
	fun subsets(nums: IntArray): List<List<Int>> {
		helper(0, nums, mutableListOf<Int>())
		return res
	}
	private fun helper(start: Int, nums: IntArray, subset: MutableList<Int>) {
		if(start > nums.size) return
		res.add(subset.toMutableList())
		for(i in start until nums.size) {
			subset.add(nums[i])
			helper(i + 1, nums, subset)
			subset.removeAt(subset.size - 1)
		}
	}
}
