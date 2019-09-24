package Array

class Solution {
	fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
		arr.sort()
		var diff = Int.MAX_VALUE
		var res = mutableListOf<List<Int>>()

		for (i in 0..arr.size - 2) {
			if (arr[i + 1] - arr[i] < diff) {
				diff = arr[i + 1] - arr[i]
				res.clear()
				res.add(listOf(arr[i], arr[i + 1]))
			} else if (arr[i + 1] - arr[i] == diff) {
				res.add(listOf(arr[i], arr[i + 1]))
			}
		}
		return res
	}
}
