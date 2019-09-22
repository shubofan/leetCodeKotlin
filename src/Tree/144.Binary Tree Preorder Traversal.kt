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
import java.util.Stack

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        var res = mutableListOf<Int>();

        if (root == null) return res;

        var stack = Stack<TreeNode>()
        stack.push(root);

        while(!stack.isEmpty()) {
            var top = stack.pop()
            res.add(top.`val`)

            if(top?.right != null) stack.push(top?.right)
            if(top?.left != null) stack.push(top?.left)
        }
        return res
    }
}
