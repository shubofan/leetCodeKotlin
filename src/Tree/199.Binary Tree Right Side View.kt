package Tree

import java.util.LinkedList

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        var queue = LinkedList<TreeNode>()
        var res = mutableListOf<Int>()
        if(root == null) return res

        queue.offer(root)
        while(!queue.isEmpty()){
            var size = queue.size
            var foundRightMost = false
            while(size > 0) {
                var top = queue.poll()
                if(!foundRightMost) {
                    res.add(top.`val`)
                    foundRightMost = true
                }
                if(top.right != null) queue.offer(top.right)
                if(top.left != null) queue.offer(top.left)
                size --
            }
        }
        return res
    }
}

