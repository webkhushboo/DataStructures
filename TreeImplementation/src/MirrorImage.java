import java.util.Scanner;

public class MirrorImage {

	Node root ;
	
	MirrorImage(int data){
		root = new Node(data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int Q = scan.nextInt();
    String[] input = new String[N];
    scan.nextLine();
    MirrorImage tree = new MirrorImage(1);
    
    for(int i=0;i<N;i++){
    	input[i] = scan.nextLine();
    	int parentData = Integer.parseInt(input[i].split(" ")[0]);
    	int childData = Integer.parseInt(input[i].split(" ")[1]);
    	String position = input[i].split(" ")[2];
    	Node parent = tree.searchNode(tree.root,parentData);
    	tree.addNodeTree(parent, childData ,position);
    	
    }
    tree.preOrder(tree.root);
	}
	
	private void preOrder(Node root){
		 Node temp =root;
		 if(temp == null){
			 return;
		 }
		 else {
			 System.out.println(temp.data);
			 preOrder(temp.left);
			 preOrder(temp.right);
		 }
	}
	private Node searchNode(Node root ,int data){
		Node temp = root;
		//while(temp != null){
			if(temp.data == data)
				return temp;
			else{
			temp.left = searchNode(temp.left,data);
			temp.right = searchNode(temp.right,data);
			//}
		}
		return temp;
	} 
	private void addNodeTree(Node parent, int childData, String position) {
		// TODO Auto-generated method stub
		if(position.equals("L")){
			parent.left = new Node(childData);
		}
		else {
			parent.right = new Node(childData);
		}
		
	}

}
