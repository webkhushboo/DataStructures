import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static class MyQueue<T> {
		Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        private void moveAllElements(Stack<T> from, Stack<T> to) {
            while (!from.empty()) {
                to.push(from.pop());
            }
        }

        public T peek() {
            if (stackOldestOnTop.isEmpty()) {
                moveAllElements(stackNewestOnTop, stackOldestOnTop);
            }
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            if (stackOldestOnTop.isEmpty()) {
                moveAllElements(stackNewestOnTop, stackOldestOnTop);
            }
            return stackOldestOnTop.pop();
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
