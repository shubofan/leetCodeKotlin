class Solution {
	val res = mutableListOf<String>()

	fun letterCasePermutation(S: String): List<String> {
		helper(0, StringBuilder(), S)
		return res
	}

	fun helper(start: Int, sb:StringBuilder, S: String) {
		if(start == S.length) {
			res.add(sb.toString())
			return
		}
		if(S[start].isLetter()) {
			sb.append(S[start].toUpperCase())
			helper(start + 1, sb, S)
			sb.delete(sb.length - 1, sb.length)
			sb.append(S[start].toLowerCase())
			helper(start + 1, sb, S)
			sb.delete(sb.length - 1, sb.length)
		} else {
			sb.append(S[start])
			helper(start + 1, sb, S)
			sb.delete(sb.length - 1, sb.length)
		}
	}
}
