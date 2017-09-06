package techgig;


import java.io.*;
import java.util.*;

class Node {
     int data ;
     Node next;
     
     Node(int data){
         this.data =data;
         this.next = null;
     }
}

class LinkedList {
     Node head ;
     public void addNode(int data){
         Node newNode = new Node(data);
         if(head == null)
            head = newNode;
         else 
            {   Node temp = head;
                while(temp.next !=null){
                    temp =temp.next;
                }
                temp.next= newNode;
            }
     }
     
     public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
     }
}
public class PrintExactSameList {
	public static void main(String args[] ) throws Exception {
	    LinkedList list = new LinkedList();
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int i=0;
	    while(i<n){
	        int data = scan.nextInt();
	        list.addNode(data);
	        i++;
	    }
	    list.printLinkedList();
	   }
}
