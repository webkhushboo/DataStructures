class Node {
	int data;
	Node next;
	Node(int data){
		this.data =data;
		next =null;
	}
}

public class LinkedListDetectCycle {
	private Node head;
	LinkedListDetectCycle(){
		head =null;
	}
	boolean hasCycle(Node head) {
		if(head== null || head.next == null)
		return false;
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(fast_ptr != null && fast_ptr.next !=null){
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
			if(slow_ptr == fast_ptr)
				return true;
		}
		return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedListDetectCycle list = new LinkedListDetectCycle();
	list.head =new Node(10);
	list.head.next = new Node (20);
	list.head.next.next = new Node(30);
	list.head.next.next = list.head;
	System.out.println(list.hasCycle(list.head));
	}

}
