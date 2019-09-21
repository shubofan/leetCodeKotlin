package src.Tree

import java.util.Stack

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
 }


// Iterative solution, post-order bottom_top traverse


class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true

        var stack = Stack<TreeNode?>()

        var lst = mutableListOf<TreeNode?>()

        stack.push(root)

        while(!stack.isEmpty()) {
            var top = stack.pop()
            lst.add(top)
            if(top?.left != null) stack.push(top.left)
            if(top?.right != null) stack.push(top.right)
        }

        lst.reverse()

        var map = mutableMapOf<TreeNode?, Int>()
        map[null] = 0

        // from bottom, for each node, found its max depth
        // if the difference of left node's max depth and right node's max depth is greater than 1, return false
        for(node in lst) {
            var depth_l = map[node?.left]
            var depth_r = map[node?.right]
            if (depth_l != null) {
                if (Math.abs(depth_l - depth_r!!) > 1) return false
            }
            map[node] = Math.max(depth_l!!, depth_r!!) + 1
        }
        return true
    }
}