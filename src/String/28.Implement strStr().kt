package String

class Solution {
	fun strStr(haystack: String, needle: String): Int {
		if(needle == null || needle == "") return 0
		if(needle.length > haystack.length) return -1

		var i = 0
		var j = 0

		while(i < haystack.length) {
			var start = i
			while(j < needle.length && start < haystack.length && haystack[start] == needle[j]) {
				j ++
				start ++
			}
			if (j == needle.length) return i
			else {
				i ++
				j = 0
			}
		}
		return -1
	}
}