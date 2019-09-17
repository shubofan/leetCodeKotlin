package Tree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 */
import java.util.*

 class TreeNode(var `val`: Int) {
      var left: TreeNode? = null
      var right: TreeNode? = null
 }

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var q = LinkedList<TreeNode>()

        var res = ArrayList<List<Int>>()

        if(root == null) return res

        q.offer(root)

        while(!q.isEmpty()) {
            var size = q.size
            var level = ArrayList<Int>()

            for(i in 0..size - 1) {
                var top = q.poll()
                level.add(top.`val`)

                if(top?.left != null) q.offer(top?.left)
                if(top?.right != null) q.offer(top?.right)
            }
            res.add(level)
        }
        return res
    }
}