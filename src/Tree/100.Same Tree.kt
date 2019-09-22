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

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null) return true;
        if(p != null && q == null || p == null && q != null) return false

        var stack1 = Stack<TreeNode?>()
        var stack2 = Stack<TreeNode?>()

        stack1.push(p)
        stack2.push(q)

        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            var cur1 = stack1.pop()
            var cur2 = stack2.pop()

            if(cur1?.`val` != cur2?.`val`) return false

            if(cur1?.left != null && cur2?.left != null) {
                stack1.push(cur1?.left)
                stack2.push(cur2?.left)
            } else if(cur1?.left != null && cur2?.left == null || cur1?.left == null && cur2?.left != null) {
                return false
            }

            if(cur1?.right != null && cur2?.right != null) {
                stack1.push(cur1?.right)
                stack2.push(cur2?.right)
            } else if(cur1?.right != null && cur2?.right == null || cur1?.right == null && cur2?.right != null) {
                return false
            }
        }
        return true
    }
}
