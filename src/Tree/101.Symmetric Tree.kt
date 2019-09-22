package Tree

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null) return true;
        return isMirror(root?.left , root?.right)
    }

    fun isMirror(root1: TreeNode?, root2: TreeNode?): Boolean {
        if(root1 == null && root2 == null) return true
        else if(root1 == null || root2 == null) return false
        else if(root1.`val` !=  root2.`val`) return false
        else return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left)
    }
}
