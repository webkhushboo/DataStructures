import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
    	 arr[i] = scan.nextInt();
     }
     
     int sum = scan.nextInt();
     
     for(int i=0;i<n-1;i++){
    	if(arr[i]+arr[i+1]==sum)
    		System.out.println("True");
     }
	}

}
