package Tree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        if(root.left != null && root.right != null) return 1 + Math.min(minDepth(root.left), minDepth(root.right))
        else return 1 + Math.max(minDepth(root.left), minDepth(root.right))
    }
}