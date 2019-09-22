package Tree

import java.util.Stack

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        var cur = root
        var stack = Stack<TreeNode>()
        var res = mutableListOf<Int>()

        if(cur == null) return res

        stack.push(root)

        while(!stack.isEmpty()) {
            var top = stack.pop()
            res.add(top.`val`)

            // pre-order is m->l->r, push order will be r -> l
            // post-order is l->r->m, reversed order will be m ->r ->l, r will need to be poped at first so push order will be l->r
            if(top?.left != null) stack.push(top?.left)
            if(top?.right != null) stack.push(top?.right)
        }
        return res.reversed()
    }
}
