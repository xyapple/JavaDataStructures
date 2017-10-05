package Recursion;
/*leetcode.com
* Given a binary tree, find the length of the longest path where each node in the path has the same value.
* This path may or may not pass through the root.
* */
public class LongestUnivaluePath {
    /*
    *Definition for a binary tree node.
    * */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }
    class Solution{
        int ans;
        public int longestUnivaluePath(TreeNode root){
            ans = 0;
            arrowLength(root);
            return ans;
        }
        public int arrowLength(TreeNode root){
            if(node == null){
                return 0;
            }
            int left = arrowLength(node.left);
            int right = arrowLength(node.right);
            int arrowLeft = 0;
            int arrowRight = 0;
            
            
        }
    }
}
