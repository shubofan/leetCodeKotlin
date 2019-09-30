package Stack

import java.util.Stack
import java.lang.StringBuilder

class Solution {
	fun removeDuplicates(S: String): String {
		if (S == null || S.length < 2) return S
		var ss = S
		var stack = Stack<Char>()

		for (c in ss.toCharArray()) {
			if (stack.isNotEmpty() && c == stack.peek()) {
				stack.pop()
			} else stack.push(c)
		}

		var sb = StringBuilder()
		while (stack.isNotEmpty()) {
			sb.append(stack.pop())
		}
		return sb.reverse().toString()
	}
}
