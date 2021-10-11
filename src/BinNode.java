public class BinNode {
    int data;
    BinNode right;
    BinNode left;

    public BinNode(int data){
        this.data = data;
        left = right = null;
    }
    
    @Override
    public String toString() {
        String txt = "";
        if (left != null) {
            txt = left.toString();
        } 
        txt += " / " + data + " \\ ";
        if (right != null) {
            txt += right.toString();
        }
        return  txt;
    }
}
