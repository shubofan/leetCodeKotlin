package Graph

import java.util.*

class Solution {
	fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
		val inDegree = IntArray(numCourses){0}
		var g = mutableMapOf<Int, MutableList<Int>>()
		var stack = Stack<Int>()

		// construct the graph
		for(arr in prerequisites) {
			var key = arr[0]
			var value = arr[1]
			inDegree[value] ++
			g.putIfAbsent(value, mutableListOf())
			g.putIfAbsent(key, mutableListOf())
			g[key]?.add(value);
		}

		for(i in inDegree.indices) {
			if(inDegree[i] == 0) stack.push(i)
		}

		while(!stack.isEmpty()) {
			var top = stack.pop()

			if(!g.contains(top)) continue

			for(next in g[top]!!){
				if(inDegree[next] == 1){
					stack.push(next);
				}
				inDegree[next] --
			}
		}

		for(i in inDegree.indices) {
			if(inDegree[i] != 0)  return false
		}
		return true
	}
}
