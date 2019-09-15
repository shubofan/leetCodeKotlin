package Tree

import java.util.Stack

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        var cur = root
        var stack = Stack<TreeNode>()
        var min = - Double.MAX_VALUE

        while(!stack.isEmpty() || cur != null) {
            while(cur != null) {
                stack.push(cur)
                cur = cur.left
            }
            var top = stack.pop()
            if (top.`val` <= min) return false;
            min = top.`val`.toDouble()
            cur = top?.right
        }
        return true
    }
}