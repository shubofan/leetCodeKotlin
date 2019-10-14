package String

class Solution {
	fun isPalindrome(s: String): Boolean {
		if(s.isEmpty()) return true
		var sb = StringBuilder()
		for(c in s.toCharArray()) {
			if (c.isLetter()) sb.append(c.toLowerCase())
			if (c.isDigit()) sb.append(c)
		}
		return sb.toString() == sb.reverse().toString()
	}
}