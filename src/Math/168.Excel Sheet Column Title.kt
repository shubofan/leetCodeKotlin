package Math

import java.lang.StringBuilder

class Solution {
	fun convertToTitle(n: Int): String {
		var sb = StringBuilder()
		var i = n

		while(i != 0) {
			sb.insert(0, ((i - 1) % 26 + 65).toChar())
			i = (i - 1) / 26
		}
		return sb.toString()
	}
}