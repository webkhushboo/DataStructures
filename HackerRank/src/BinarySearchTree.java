class NodeBT {
        int data;
        NodeBT left;
        NodeBT right;
       public NodeBT(int data){
    	   this.data = data;
    	   left =right= null;
       }
     }

public class BinarySearchTree {
	 
	
	boolean checkBST(NodeBT root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkBST(NodeBT node, int min, int max) {
        if (node == null) return true;
        return  min < node.data && node.data < max && 
            checkBST(node.left, min, node.data) && 
            checkBST(node.right, node.data, max);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
