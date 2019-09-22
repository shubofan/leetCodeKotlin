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
import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {

        var stack = Stack<List<Int>>()
        var queue = LinkedList<TreeNode>()

        var res = mutableListOf<List<Int>>()

        if(root == null) return res

        queue.offer(root)

        while(!queue.isEmpty()) {
            var size = queue.size;
            var lst = mutableListOf<Int>()

            while(size > 0) {
                var cur = queue.poll()
                lst.add(cur.`val`)
                if(cur.left != null) queue.offer(cur.left)
                if(cur.right != null) queue.offer(cur.right)
                size --;
            }
            stack.push(lst);
        }

        while(!stack.isEmpty()) {
            res.add(stack.pop())
        }

        return res
    }
}
