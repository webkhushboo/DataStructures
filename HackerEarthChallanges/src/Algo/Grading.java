package Algo;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int  N = scan.nextInt();
     scan.nextLine();
     int arr[] = new int[N];
     for(int i =0; i<N ;i++){
    	 arr[i] = scan.nextInt();
    	 if(arr[i] >= 38) {
    		 int n = arr[i]/5;
    		 int next = (n+1)*5;
    		 if(next - arr[i] <3){
    			 arr[i] =next;
    		 }
    	 }
     }
     
     for(int i =0; i<N ;i++){
    	 System.out.println(arr[i]);
     }
	}

}
