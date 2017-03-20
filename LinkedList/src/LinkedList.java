
public class LinkedList {

	Node head;
	public LinkedList(){
		head= null;
    }
	
	public Node addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newNode;
			
		}
		return newNode;
	}
	
	public void deleteNode(){
		if(head == null){
			System.out.println("Out of index so can't be deleted");
		} else if(head.next == null){
			head = null;
		} else {
		Node current = head;
		while(current.next.next !=null){
			 current= current.next;
			}
		current.next = null;
		}
	}
	public void printNode(){
		Node current = head;
		if(head == null){
			System.out.println("Empty list");
		}
		while(current !=null){
		 System.out.println(current.getData());
		 current= current.next;
		}
	}
	
	public void printNthNodeFromLast(int n){
		int len =1;
		if(head == null) return;
		Node current = head;
		while(current.next != null){
			len++;
			current =current.next;
		}
		Node temp = head;
		for (int i =1 ; i< len-n+1;i++){
			temp = temp.next;
		}
		System.out.println(temp.getData());
	}
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		System.out.println("Before deleting element");
		list.printNode();
		System.out.println("After deleting element");
		list.deleteNode();
		list.deleteNode();
		list.deleteNode();
		list.printNode();
		System.out.println("Adding elements");
		list.addNode(190);
		list.addNode(209);
		list.addNode(308);
		list.printNode();
		System.out.println("Printing n'th element from last");
		list.printNthNodeFromLast(2);
		
	}
}
