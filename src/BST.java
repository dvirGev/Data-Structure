public class BST {
    BinNode tree;
    
    public BST(int data){
        tree = new BinNode(data);
    }

    public void add(int data){
        add(tree, data);
    }
    public void add(BinNode tree, int data){
        if (data < tree.data) {   
            if (tree.left != null) {
                add(tree.left , data);
            }
            else {
                tree.left = new BinNode(data);
            }
        }
        else {
            if (tree.right != null) {
                add(tree.right , data);
            }
            else {
                tree.right = new BinNode(data);
            }
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return tree.toString();
    }
}
