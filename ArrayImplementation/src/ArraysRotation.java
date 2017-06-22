import java.util.Scanner;

public class ArraysRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		
		int[] output = new int[n];
		int[] temp = new int[k];
		int index=0;
		//Shift starting elements upto no of rotation in temporary array
		for(int i =0;i <k;i++){
			temp[i] = a[i];
		}
		
		//Shift remaining elements in output array
		for(int j = 0; j < n-k;j++){
		output[index++] = a[k+j];
		}
		
		//Shift temporary elements in output array
		for(int m =0 ;m<k;m++){
			output[index++]= temp[m];
		}
		return output;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = scan.nextInt();
        System.out.println("Enter no of rotation:");
        int k = scan.nextInt();
        System.out.println("Enter array elements:");
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = scan.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }

}
