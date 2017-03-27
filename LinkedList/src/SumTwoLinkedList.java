
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class SumTwoLinkedList {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode c1 = l1;
	        ListNode c2 = l2;
	        ListNode temp = new ListNode(0);
	        ListNode d = temp;
	        int sum = 0;
	        while (c1 != null || c2 != null) {
	            sum /= 10;
	            if (c1 != null) {
	                sum += c1.val;
	                c1 = c1.next;
	            }
	            if (c2 != null) {
	                sum += c2.val;
	                c2 = c2.next;
	            }
	            d.next = new ListNode(sum % 10);
	            d = d.next;
	        }
	        if (sum / 10 == 1)
	            d.next = new ListNode(1);
	        return temp.next;
	    }
	    
	public static void main(String[] args){
		SumTwoLinkedList list = new SumTwoLinkedList();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode temp = list.addTwoNumbers(l1,l2);
		while(temp != null){
			System.out.println(temp.val);
			temp =temp.next;
		}
		
	}    
}
