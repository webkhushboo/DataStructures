import java.util.LinkedList;

public class StackImplUsingQueue {
	
	private static LinkedList<Integer> q1 = new LinkedList<Integer>();
	private static LinkedList<Integer> q2 = new LinkedList<Integer>();
    private static int top =0;
	
	public static void push(int data){
		q1.add(data);
		top++;
	}
	
	public static int pop(){
		while(top >1){
		int data=	q1.remove();
		q2.add(data);
		top--;
		}
		int popped_element = q1.remove();
		top--;
		LinkedList<Integer> temp =q2;
		q2= q1;
		q1=temp;
		top = q1.size();
		return popped_element;
	}
	
	public static boolean isEmpty(){
		if(top == 0){
			return true;
		}
		return false;
	}
	
	public static int getSize(){
		return top;
	}
	
	public static void main(String[] args){
		push(10);
		push(20);
		push(30);
		System.out.println(pop());
		push(40);
		push(50);
		System.out.println("Function empty :" +isEmpty());
		System.out.println(pop());
		System.out.println("Size of stack is :" +getSize());
		System.out.println(pop());
		System.out.println(pop());
	}
}
