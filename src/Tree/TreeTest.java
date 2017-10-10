package Tree;

public class TreeTest {
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    
    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeTest test = new TreeTest();
        
        TreeNode sampleTree = creator.createSampleTree();
        test.preOrder(sampleTree);
        System.out.println();
    }
}
