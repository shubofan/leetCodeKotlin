package Tree

import java.util.*

class Solution {
	fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
		var res = mutableListOf<List<Int>>()
		var queue = LinkedList<TreeNode>()

		if(root == null) return res
		var level = 1

		queue.offer(root)

		while(!queue.isEmpty()){
			var size = queue.size
			var lst = mutableListOf<Int>()
			while(size > 0){
				var top = queue.poll()
				lst.add(top.`val`)
				size --
				if(top.left != null) queue.offer(top.left)
				if(top.right != null) queue.offer(top.right)
			}
			if(level % 2 == 0) lst.reverse()
			res.add(lst)
			level ++
		}
		return res
	}
}
