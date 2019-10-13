package BackTracking

class Solution {
	val res = mutableListOf<MutableList<String>>()

	fun partition(s: String): List<List<String>> {
		helper(s, mutableListOf<String>())
		return res
	}

	private fun helper(s: String, path: MutableList<String>) {
		if(s.isEmpty()) {
			res.add(path.toMutableList())
			return
		}

		for(i in s.indices) {
			var subs = s.substring(0, i + 1)
			if(isValid(subs)) {
				path.add(subs)
				helper(s.substring(i + 1), path)
				path.removeAt(path.size - 1)
			}
		}
	}

	private fun isValid(s: String): Boolean {
		var l = 0
		var r = s.length - 1
		while(l < r) {
			if(s[l] != s[r]) return false
			l ++
			r --
		}
		return true
	}
}
