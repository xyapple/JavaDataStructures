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
    /*
    * Recusion
    * */
   /* class Solution{
        int ans;
        public int longestUnivaluePath(TreeNode root){
            ans = 0;
            arrowLength(root);
            return ans;
        }
        public int arrowLength(TreeNode node){
            if(node == null){
                return 0;
            }
            int left = arrowLength(node.left);
            int right = arrowLength(node.right);
            int arrowLeft = 0;
            int arrowRight = 0;
            if(node.left != null && node.right.val == node.val){
                arrowLeft = arrowLeft + left + 1;
            }
            if(node.right != null && node.left.val == node.val){
                arrowRight = arrowRight + right + 1;
            }
            ans = Math.max(ans, arrowLeft+arrowRight);
            return Math.max(arrowLeft, arrowRight);
            
        }
      
    }*/
   
   //The output of this solution is wrong!
   class Solution{
       int result = 0;
       public int longestUnivaluePath(TreeNode root){
           dfs(root);
           return result;
       }
       private int dfs(TreeNode root){
           if(root == null) {
               return 0;
           }
           int left = dfs(root.left);
           int right = dfs(root.right);
           
           if(root.left == null && root.right == null){
               return 0;
           }else if(root.left != null & root.right == null){
               if(root.val == root.left.val){
                   result = Math.max(result, left+1);
                   return left + 1;
               }else {
                   return 0;
               }
           }
           else if(root.left == null && root.right != null){
               if(root.val == root.right.val){
                   result = Math.max(result, right + 1);
                   return right + 1;
               }else {
                   return 0;
               }
           } else {
               if(root.val == root.left.val && root.val != root.right.val){
                   result = Math.max(result, left+1);
                   return left + 1;
               } else if(root.val != root.left.val && root.val == root.right.val){
                   result = Math.max(result, right+1);
                   return right + 1;
               } else if(root.val != root.left.val && root.val != root.right.val){
                   return 0;
               } else {
                   result = Math.max(result, left+right+2);
                   return Math.max(left, right) + 1;
               }
           }
       }
    }
    
}
