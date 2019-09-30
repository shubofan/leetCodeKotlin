package Array

import kotlin.math.min


class Solution {
	fun findMin(nums: IntArray): Int {
		if(nums.size == 1) return nums[0]
		var l = 0
		var r = nums.size - 1
		var mid: Int = 0
		while(l < r) {
			var mid = (l + r) / 2
			if(nums[mid] < nums[r]) l = mid
			else r = mid
		}
		if(mid == l) return min(nums[mid], nums[r])
		if(mid == r) return min(nums[mid], nums[l])
		return nums[mid]
	}
}