import java.util.Stack
import java.lang.StringBuilder

class Solution {
	fun removeDuplicates(s: String, k: Int): String {
		if(k == 1) return ""

		var ss = s
		var stack = Stack<P>()

		for(c in ss.toCharArray()) {
			if(stack.isNotEmpty() && c == stack.peek().c){
				stack.push(P(c, stack.peek().fre + 1))
			} else stack.push(P(c,1))

			if(stack.peek().fre == k) {
				var kk = k
				while(kk > 0) {
					stack.pop()
					kk --
				}
			}
		}

		var sb = StringBuilder()
		while(stack.isNotEmpty()) {
			sb.append(stack.pop().c)
			var pp = P('a', 3)
			pp.
		}
		return sb.reverse().toString()
	}
}

private class P(c: Char, i: Int) {
	var c: Char
	get() = this.c
	set(value) {c}

	var fre: Int = ic
	get()
}
