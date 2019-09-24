package Array

class Solution {
	fun twoSum(numbers: IntArray, target: Int): IntArray {
		var l = 0
		var r = numbers.size - 1
		while(l < r) {
			if (numbers[l] + numbers[r] == target) return intArrayOf(l + 1, r + 1)
			else if(numbers[l] + numbers[r] < target) l ++
			else r --
		}
		return intArrayOf(0, 0)
	}
}
