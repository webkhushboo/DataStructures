import java.util.Scanner;

public class ReverseArray {
	private static Scanner s;

	public static void main(String args[] ) throws Exception {
        s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println("Enter numbers ");
        int[] arr = new int[N];
        int[] arrR = new int[N];
        for(int i =0; i<N ;i++)
          arr[i] = s.nextInt();
        int j=0;
        for(int i=N-1; i>=0;i--){
        	arrR[j] = arr[i];
        	j++;
        }
        for(int i =0; i<N;i++){
        System.out.println(arrR[i]);
        }
    }
}
