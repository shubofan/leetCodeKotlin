package Stack

import java.util.*

class Solution {
	fun dailyTemperatures(T: IntArray): IntArray {
		val arr = IntArray(T.size) {0}
		var stack = Stack<Int>()

		for(i in T.indices) {
			while(!stack.isEmpty() && T[i] > T[stack.peek()] ) {
				arr[stack.peek()] = i - stack.pop()
			}
			stack.push(i)
		}
		return arr
	}
}

