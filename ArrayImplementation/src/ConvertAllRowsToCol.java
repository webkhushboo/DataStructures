import java.util.Scanner;

public class ConvertAllRowsToCol {

	private static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		int[][] arr = new int[R][C];
		for (int i=0 ;i< R; i++){
			for(int j=0; j< C;j++){
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0 ;i< C; i++){
			for(int j=0; j< R;j++){
			   System.out.print(arr[j][i] + " ");	
			}
			System.out.println();
		}
	}
}
