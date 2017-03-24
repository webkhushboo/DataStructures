import java.util.Scanner;

class stack {
	int top =-1;
	int N= 10;
	int[] stackarr = new int[10];
	
	public void push(int data){
		if(stackarr.length > top)
			resize();
		stackarr[top++] =data;
	}
	public void resize(){
		int[] temp = new int[N];
		int size = N;
		N = 2*N;
		int[] newArr = new int[N];
		for (int i =0;i<size;i++){
			newArr[i] = temp[i];
		}
		stackarr = newArr;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int pop(){
		if(isEmpty()){
		 return -1;
		}
		else {
		 return	stackarr[top--];
		}	
	}
}
public class MonksLoveForFoodImpl {
    
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
		stack stack = new stack();
		int i =0;
		while(i<N){
			String input = scan.nextLine();
			String[] arr = input.split(" ");
			if(arr.length > 1){
				stack.push(Integer.parseInt(arr[1]));
			} else {
				int elem = stack.pop();
				if(elem == -1){
					System.out.println("No Food");
				} 
				else System.out.println(elem);
			}
		}
	}
}
