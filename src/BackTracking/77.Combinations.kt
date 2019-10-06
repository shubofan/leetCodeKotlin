package BackTracking

class Solution {
	val res = mutableListOf<MutableList<Int>>()

	fun combine(n: Int, k: Int): List<List<Int>> {

		helper(n, k, 1, mutableListOf())
		return res
	}

	private fun helper(n: Int, k: Int, start: Int, tem:MutableList<Int>) {
		if(tem.size == k) {
			res.add(tem.toMutableList())
			return
		}

		for(j in start..n) {
			tem.add(j)
			helper(n, k, j + 1, tem)
			tem.removeAt(tem.size - 1)
		}
	}
}
