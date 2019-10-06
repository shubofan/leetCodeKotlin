package Array

class Solution {
	fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
		var ll1 = m - 1
		var ll2 = n - 1

		var last = m + n - 1

		for(i in last downTo 0) {
			if (ll2 == -1) {
				break
			} else if (ll1 == -1||nums2[ll2] >= nums1[ll1]) {
				nums1[i] = nums2[ll2--]
			} else {
				nums1[i] = nums1[ll1--]
			}
		}
	}
}
