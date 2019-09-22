package Tree

class Solution {
	fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
		if(s == null) return t == null
		return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t)
	}

	fun isSame(s: TreeNode?, t: TreeNode?): Boolean {
		if(s == null || t == null) {
			return (s == t)
		}

		return (s.`val` == t.`val` &&isSame(s.left, t.left) && isSame(s.right, t.right))
	}
}
