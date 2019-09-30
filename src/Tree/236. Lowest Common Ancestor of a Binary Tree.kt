package Tree

import java.util.Stack

class Solution {
	fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q:TreeNode): TreeNode? {
		if(root == null) return root
		var parent = mutableMapOf<TreeNode?, TreeNode?>()
		var stack = Stack<TreeNode?>()

		parent[root] = null
		stack.push(root)

		while (!parent.contains(p) || !parent.contains(q) && stack.isNotEmpty()) {
			var top = stack.pop()
			if (top?.right != null) {
				parent[top.right] = top
				stack.push(top.right)
			}

			if (top?.left != null) {
				parent[top.left] = top
				stack.push(top.left)
			}
		}

		var set = mutableSetOf<TreeNode?>()

		var pp = p
		while (pp != null) {
			set.add(pp)
			pp = parent[pp]!!
		}

		var qq = q

		while(!set.contains(qq))
			qq = parent[q]!!
		return qq
	}
}
