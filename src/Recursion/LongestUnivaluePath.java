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
   class Solution{
       public int longestUnivaluePath(TreeNode root){
           if(root == null) return 0;
           int val = 0;
           int result = 0;
           // calculate the left side of the tree
           if(root.left != null && root.right.val == val){
               result = 1 + dfs(root.left);
           }
           // calculate the right side of the tree
           if(root.right != null && root.right.val == val){
               result = 1 + dfs(root.right);
           }
           return Math.max(result, Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right)));
       }
       public int dfs(TreeNode root){
           if(root == null) return 0;
           int val = root.val;
           int result = 0;
           if(root.left != null && root.right.val == val){
               result = 1 + dfs(root.left);
           }
           if(root.right != null && root.right.val == val){
               result = Math.max(result, 1+dfs(root.right));
           }
           return result;
       }
    }
    
}
