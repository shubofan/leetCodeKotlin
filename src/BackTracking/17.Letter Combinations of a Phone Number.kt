package BackTracking

class Solution {
	private val map = mapOf('2' to listOf("a","b","c"), '3' to listOf("d","e", "f"), '4' to listOf("g","h", "i"), '5' to listOf("j","k", "l"),
			'6' to listOf("m","n", "o"),'7' to listOf("p","q", "r","s"),'8' to listOf("t","u","v"),'9' to listOf("w","x","y","z"))

	fun letterCombinations(digits: String): List<String> {
		var res = mutableListOf<String>()
		if(digits == "") return res
		helper(digits, 0, StringBuilder(), res)
		return res
	}

	private fun helper(digits: String, index: Int, sb:StringBuilder, res: MutableList<String>) {
		if(index == digits.length) {
			res.add(sb.toString())
			return
		} else {
			for(char in map[digits[index]]!!) {
				sb.append(char)
				helper(digits, index + 1, sb, res)
				sb.delete(sb.length - 1, sb.length)
			}
		}
	}
}
