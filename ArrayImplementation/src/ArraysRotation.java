import java.util.Scanner;

public class ArraysRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		
		/*int p=0;
		while(p<k){
		int[] output = new int[n];
		for(int i =0; i<n-1;i++){
			output[i] = a[i+1];
		}
		for(int j = 0; j < 1;j++){
			output[n-1] =a[j];
		}
		p++;
		a =output;
		}
		
		return a;*/
		int[] output = new int[n];
		for(int j = 0; j < n;j++){
		output[(j + n - k) % n] = a [j];
		}
		return output;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }

}
