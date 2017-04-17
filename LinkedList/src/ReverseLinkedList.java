
public class ReverseLinkedList {
	
	Node head ;
	ReverseLinkedList(){
		head = null;
	}
	
	public void add(int data){
		if(head == null){
			head = new Node(data);
		}
		else {
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			
			Node node = new Node(data);
			temp.next = node;
		}
	}
	
	
	public void ReversePrint(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
	 Node current = head;
	 Node prev = null;
	 Node next = null;
     while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
	}
      
     System.out.println("Reverse linked list :");
     while(prev !=null){
    	 System.out.println(prev.getData());
    	 prev =prev.next;
     }
	}
	
	
	static int CompareLists(Node headA, Node headB) {
	  /*  Node Thead1 = headA;
			Node Thead2 = headB;
			int len1=0;
			int len2=0;
			int val =1;
			while(Thead1 != null){
				Thead1 = Thead1.next;
				len1++;
			}
			while(Thead2 != null){
				Thead2 = Thead2.next;
				len2++;
			}
			if(len1 != len2)
				val =0;
			else {
				Node temp =headA;
				while(temp != null){
					if(headA.getData() != headB.getData()){
						val =0;
						break;
					}
					temp =temp.next;
				}  
			}
			return val; */
		 if(headA ==null && headB ==null)
             return 1;
			if(headA == null){
				return 0;		}
			if(headB == null){
				return 0;
			}
          if(headA.getData() != headB.getData())
             return 0;
          
          return CompareLists(headA.next,headB.next);
			
	  
	}
	
	public Node MergeLists(Node headA, Node headB) {
		if(headA == null)
			return headB;
		if(headB == null)
			return headA;
		Node mergeHead = null ;
		if(headA.getData() > headB.getData()){
			mergeHead = headB;
			mergeHead.next = MergeLists(headA , headB.next);
			}
		if(headB.getData() > headA.getData()){
			mergeHead = headA;
			mergeHead.next = MergeLists(headA.next , headB);
			}
		
		
		return mergeHead;
	     // This is a "method-only" submission. 
	     // You only need to complete this method 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ReverseLinkedList list = new ReverseLinkedList();
     list.add(12);
     //list.add(2);
   //  list.ReversePrint(list.head);
     ReverseLinkedList list2 = new ReverseLinkedList();
     list2.add(13);
     //list2.add(2);
     int val = CompareLists(list.head ,list2.head);
     System.out.println(val);
	}

}
