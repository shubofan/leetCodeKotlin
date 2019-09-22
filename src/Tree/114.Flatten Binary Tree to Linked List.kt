package Tree

class Solution {
	var lst = mutableListOf<TreeNode?>()

	fun flatten(root: TreeNode?): Unit {
		if(root == null) return
		preOrder(root)
		var dummy = TreeNode(-1)
		var cur = dummy
		for(node in lst) {
			cur.left = null
			cur.right = node
			cur = cur.right!!
		}
	}

	fun preOrder(root: TreeNode?):Unit {
		if(root == null) return
		lst.add(root)
		preOrder(root?.left)
		preOrder(root?.right)
	}
}
