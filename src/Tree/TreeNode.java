package Tree;
 /*how to go through all the tree node*/
public class TreeNode {
    private final char value;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(char value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
     public char getValue() {
         return value;
     }
    
     public TreeNode getLeft() {
         return left;
     }
    
     public TreeNode getRight() {
         return right;
     }
    
     public void setLeft(TreeNode left) {
         this.left = left;
     }
    
     public void setRight(TreeNode right) {
         this.right = right;
     }
     
 }
