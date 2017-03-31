import java.util.Scanner;

public class AkashAndGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     int[] arr = new int[N];
     scan.nextLine();
     for(int i =0;i< N;i++){
    	 arr[i] = scan.nextInt();
     }
     
     int q = scan.nextInt();
     scan.nextLine();
     String[] inputQueries = new String[q];
     for(int i=0;i<q;i++){
    	 inputQueries[i] = scan.nextLine();
    	// String[] inputs = inputQueries[i].split(" ");
    	 String letter = inputQueries[i].split(" ")[0];
    	 int first = (Integer.parseInt(inputQueries[i].split(" ")[1]));
    	 int second =(Integer.parseInt(inputQueries[i].split(" ")[2])); 
    	 if(letter.equals("C")){
    		int res =0;
    	//	while(first != second){
    			res += compute(arr,first,second);	
    			//first++;
    		//}
    		
    		System.out.println(res);
    	 }
    	 else 
    		 update(arr,first-1,second);
     } 
	}

	private static void update(int[] arr,int index ,int value) {
		// TODO Auto-generated method stub
		arr[index] = value;
	}

	private static int compute(int[] arr,int x, int y) {
		// TODO Auto-generated method stub
		int sum=0;
		while(x!=y+1){
		sum += computeFx(arr,arr[x-1]);
		x++;
	  } 
		
	return sum;
		
	}

	private static int computeFx(int[] arr, int x) {
		// TODO Auto-generated method stub
		int temp =1;
		int fx=0;
		while(temp != x+1){
		fx+=computeGCD(arr,temp,x);
			temp++;
		}
		return fx;
	}

	private static int computeGCD(int[] arr, int temp, int x) {
		// TODO Auto-generated method stub
		int first = temp;
		int second = x;
		int smallest = first;
		if(first > second){
			smallest = second;
		}
		if(first % smallest ==0 && second % smallest ==0){
			return smallest;
		}
		else {
			for(int i =1 ;i< smallest/2 ;i++){
				if(first % i ==0 && second % i ==0){
					return i;
				}
			}
		}
		return 1;
	}

}
