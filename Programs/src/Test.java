import java.util.HashSet;
import java.util.Scanner;

public class Test {
	public static HashSet<Integer> firstSet = new HashSet<Integer>();
    public static HashSet<Integer> secondSet = new HashSet<Integer>();
	    public static void main(String args[] ) throws Exception {
	        
            
	        //Scanner
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter input");
	        int a= s.nextInt();
            int b = s.nextInt();
            firstSet = factors(a);
            secondSet = factors(b);
            firstSet.retainAll(secondSet);
            
	        

	        System.out.println(firstSet.size());
	    }
	
	    public static HashSet<Integer> factors(int n){
	    	HashSet<Integer> temp = new HashSet<Integer>();
	    	for(int i=1; i <= n/2 ;i++){
	    		if(n%i==0){
	    			temp.add(i);
	    		}
	    	}
	    	return temp;
	    }
}
