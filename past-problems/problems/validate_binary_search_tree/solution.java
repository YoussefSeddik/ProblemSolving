/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        boolean isValidBST(TreeNode root) {
        return is_validBST(root,  null,null);
    }
    
    boolean is_validBST(TreeNode root, TreeNode min, TreeNode max){
        if(root==null) return true;
        if(min != null && root.val<= min.val) return false;
        if(max != null && root.val >= max.val) return false;
        
        return(is_validBST(root.left, min, root) && is_validBST(root.right, root, max));
    }
}