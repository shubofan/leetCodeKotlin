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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var cur = root
        var stack = Stack<TreeNode>()
        var res = mutableListOf<Int>()

        if(cur == null) return res

        while(!stack.isEmpty() || cur != null) {
            while(cur != null) {
                stack.push(cur)
                cur = cur.left
            }

            var top = stack.pop()
            res.add(top.`val`)
            cur = top?.right
        }
        return res
    }
}
