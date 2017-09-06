import java.util.HashMap;
import java.util.Scanner;

public class PlayWithArray {

	private static void printArray(int[] arr) 
    {
		int max =arr[0];
		int secondMax = arr[0];
		int indexOfMax =0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]> max){
				secondMax =max;
				max = arr[i];
				indexOfMax = i;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			
		}
		System.out.println(max);
		System.out.println(secondMax);
    }
 
  
    /* Driver program to test the above functions */
    public static void main(String[] args) 
    {
       // int a[] = new int[]{2,2,2,2,5,5,2,3,3};
    	Scanner scan = new Scanner(System.in);
        int noOfElements = scan.nextInt();
        int[] arr = new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            arr[i] = scan.nextInt();
        }
        printArray(arr);
    }

}
