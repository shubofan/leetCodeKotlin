package BackTracking

class Solution {
	val res = mutableListOf<MutableList<Int>>()

	fun permute(nums: IntArray): List<List<Int>> {
		helper(nums, mutableListOf(), res)
		return res
	}

	fun helper(nums: IntArray, tem:MutableList<Int>, res: MutableList<MutableList<Int>>) {
		if(tem.size == nums.size) {
			res.add(tem.toMutableList())
			return
		}

		for(i in nums.indices) {
			if(tem.contains(nums[i])) continue
			tem.add(nums[i])
			helper(nums, tem, res)
			tem.removeAt(tem.size - 1)
		}
	}
}