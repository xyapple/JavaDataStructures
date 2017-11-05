package Tree;

public class TreeTest {
    /*前序遍历*/
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    /*中序遍历*/
    public void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
       
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }
     /*后序序遍历*/
     public void postOrder(TreeNode root){
         if(root == null){
             return;
         }
         postOrder(root.getLeft());
         postOrder(root.getRight());
         System.out.print(root.getValue());
     }
    public String postOrder(String preOrder, String inOrder){
         if(preOrder.isEmpty()){
             return "";
         }
         char rootValue = preOrder.charAt(0);
         int rootIndex = inOrder.indexOf(rootValue);
         return
                 postOrder(
                         preOrder.substring(1, 1+rootIndex),
                         inOrder.substring(0, rootIndex) ) +
                         postOrder(
                                 preOrder.substring(1+rootIndex),
                                 inOrder.substring(1+rootIndex)) +
                rootValue;
                
    }
    
    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeTest test = new TreeTest();
        System.out.println("==============");
        System.out.println("Sample Tree travel result: ");
        TreeNode sampleTree = creator.createSampleTree();
        test.preOrder(sampleTree);
        System.out.println();
        test.inOrder(sampleTree);
        System.out.println();
        test.postOrder(sampleTree);
        System.out.println();
        System.out.println("==============");
        System.out.println("Generating postOrder by givin preOrder and inOrder");
        TreeNode tree = creator.createTree("ABDEGCF", "DBGEACF" );
        test.postOrder(tree);
        System.out.println();
        System.out.println("==============");
        test.postOrder(tree);
        
    }
}
