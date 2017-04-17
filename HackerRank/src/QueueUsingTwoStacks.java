import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();
        int top =-1;

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
            top++;
        }

        public T peek() {
        	while(top != -1){
        		stackOldestOnTop.push(stackNewestOnTop.pop());
        		top--;
        	}
        	T val = stackOldestOnTop.peek();
        	Stack<T> temp ;
        	temp = stackNewestOnTop;
        	stackNewestOnTop = stackOldestOnTop;
        	stackOldestOnTop = temp;
        	if(stackNewestOnTop.isEmpty())
            	top =-1;
            	else
            	top = stackNewestOnTop.size()-1;
			return val;
            
        
        }

        public T dequeue() {
        	while(top != 0){
        		stackOldestOnTop.push(stackNewestOnTop.pop());
        		top--;
        	}
        	T val = stackNewestOnTop.pop();
        	Stack<T> temp ;
        	temp = stackNewestOnTop;
        	stackNewestOnTop = stackOldestOnTop;
        	stackOldestOnTop = temp;
        	if(stackNewestOnTop.isEmpty())
        	top =-1;
        	else
        	top = stackNewestOnTop.size()-1;
			return val;
            
        }
    }

    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}
