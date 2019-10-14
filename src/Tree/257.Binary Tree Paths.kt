package Tree

class Solution {
	val res = mutableListOf<String>()

	fun binaryTreePaths(root: TreeNode?): List<String> {
		if(root == null) return res
		helper(root, StringBuilder())
		return res
	}

	private fun helper(root: TreeNode?, sb: StringBuilder) {
		if(root == null) return
		if(root?.left == null && root?.right == null) {
			sb.append(root?.`val`)
			res.add(sb.toString())
		}
		sb.append(root.`val`).append("->")

		var curLength = sb.length
		if(root?.left != null) helper(root?.left, sb)
		sb.setLength(curLength)
		if(root?.right != null)  helper(root?.right, sb)
		sb.setLength(curLength)
	}
}