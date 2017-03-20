
public class LinkedList {

	private static Node head;
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
	public void printNode(Node head){
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
	
	public static Node reverseLinkedList(){
		Node current = head;
		Node prev= null;
		Node next = null;
		while (current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		System.out.println("Before deleting element");
		list.printNode(head);
		System.out.println("After deleting element");
		list.deleteNode();
		list.deleteNode();
		list.deleteNode();
		list.printNode(head);
		System.out.println("Adding elements");
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.printNode(head);
		System.out.println("Printing n'th element from last");
		list.printNthNodeFromLast(2);
		System.out.println("Printing reversed linked list");
		Node temp = reverseLinkedList();
		list.printNode(temp);
	}
}
