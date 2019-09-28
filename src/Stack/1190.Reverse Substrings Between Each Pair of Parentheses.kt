package Stack

import java.util.Stack

class Solution {
	fun reverseParentheses(s: String): String {
		var stack = Stack<Char>()
		var sb = StringBuilder()
		var sb1 = StringBuilder()

		for(c in s) {
			if(c == ')') {
				while(!stack.isEmpty()) {
					var top = stack.pop()
					if(top !='(')
						sb1.append(top)
					else
						break
				}
				for (ss in sb1) {
					stack.push(ss)
				}
				sb1.clear()
			} else(stack.push(c))
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop())
		}
		return sb.reverse().toString()
	}
}