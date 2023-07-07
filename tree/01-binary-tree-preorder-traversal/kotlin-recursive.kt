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
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        traverse(root, result)

        return result.toList()
    }

    fun traverse(root: TreeNode?, result: MutableList<Int>){
        if(root != null) {
            result.add(root.`val`)
            traverse(root.left, result)
            traverse(root.right, result)
        }
    }
}