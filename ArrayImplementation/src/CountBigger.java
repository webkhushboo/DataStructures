import java.util.Scanner;

public class CountBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int noOfElements = scan.nextInt();
        int[] arr = new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            arr[i] = scan.nextInt();
        }
        
        int noToBeChecked = scan.nextInt();
        int count =0;
        for(int i=0;i<arr.length;i++){
        	if(arr[i] > noToBeChecked)
        		 count++;
        }
        
        System.out.println(count);
	}

}
