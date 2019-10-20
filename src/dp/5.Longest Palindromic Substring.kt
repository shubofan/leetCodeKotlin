package dp

class Solution {
	fun longestPalindrome(s: String): String {
		val len = s.length
		if (s.isNullOrEmpty() || len == 1) return s
		var res = ""
		var dp = Array(len){BooleanArray(len)}
		for(i in len - 1 downTo 0) {
			for(j in i until len) {
				dp[i][j] = s[i] == s[j] && (j - i < 3 || dp[i + 1][j - 1])
				if(dp[i][j] && j - i + 1 > res.length) {
					res = s.substring(i, j + 1)
				}
			}
		}
		return res
	}
}