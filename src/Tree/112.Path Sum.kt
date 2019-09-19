package Tree

import java.util.Stack

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if (root == null) return false
        var stack = Stack<TreeNode>()
        var pathSum = Stack<Int>()

        stack.push(root)
        pathSum.push(root.`val`)

        while(!stack.isEmpty()) {
            var cur = stack.pop()
            var num = pathSum.pop()

            if(cur.left == null && cur.right == null && num == sum) return true

            if(cur.left != null) {
                stack.push(cur.left)
                pathSum.push(cur.left?.`val`?.plus(num))
            }

            if(cur.right != null) {
                stack.push(cur.right)
                pathSum.push(cur.right?.`val`?.plus(num))
            }
        }
        return false
    }
}