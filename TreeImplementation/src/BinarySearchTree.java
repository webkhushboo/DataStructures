
public class BinarySearchTree {

	public boolean checkBST(Node root){
		if(root == null){
			return true;
		}
		else {
			if(root.left != null && root.data > root.left.data){
				return checkBST(root.left);
			}
			else 
			if(root.right != null && root.data < root.right.data){
				return checkBST(root.right);
			}	
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BinarySearchTree tree = new BinarySearchTree();
     Node root = new Node(10);
     root.left = new Node(6);
     root.right =new Node(12);
     root.left.left =new Node(5);
     root.left.right=new Node(7);
     root.right.left =new Node(11);
     root.right.right =new Node(13);
     boolean flag =tree.checkBST(root);
     System.out.println(flag);
	}

}
