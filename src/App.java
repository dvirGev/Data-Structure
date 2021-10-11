import java.util.Arrays;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       for (int i = 0; i < 10; i++) {
           System.out.println(i + "=" + Q4(i));
       }
       
    }
    
    public static int Q4(int n){
        if(n <2){
            return 1;
       
        }
        if(n==2) return 2;
        return 2*(Q4(n-1) +Q4(n-2))-1;
        
    }
    public static BST creatNewBST(){
        BST tree = new  BST(rand());
        for (int i = 0; i < 10; i++) {
            tree.add(rand());
        }
        return tree;
    }
    public static boolean equals(BST tree1, BST tree2){
        return equals(tree1.tree, tree2.tree);
    }
    public static boolean equals(BinNode tree1, BinNode tree2){
        if (tree1 == null || tree2 == null) {
            if (tree1 == tree2) {
                return true;
            }
            return false;
        }
        if (tree1.left != null && tree2.left != null) {
            if (!equals(tree1.left, tree2.left)) {
                return false;
            }
        }
        if (tree1.right != null && tree2.right != null) {
            if (!equals(tree1.right, tree2.right)) {
                return false;
            }
        }
        return true;
    }
    public static int rand(){
        return (int)(Math.random() * 10);
    }
}
