
import java.util.Scanner;

public class Test2 {
		
	 public static void main(String args[] ) throws Exception {
	        
         
	        //Scanner
		 Scanner s = new Scanner(System.in);
	     System.out.println("Enter input");
	     int a= s.nextInt();
         int b = s.nextInt();
         int min = a<b?a:b;
         int i=1;
         int count =0;
         while((a>1 || b>1) && i<=min/2){
             if(a%min==0 && b%min==0){
                 count = factors(min);
                 break;
             }
             if(a%i==0 && b%i==0){
                 count++;
                 a=a/i;
                 b=b/i;
                 
             }
             i++;
         }
         System.out.println(count);
	    }
	 public static int factors(int n){
	    	int count= 0;
	    	for(int i=1; i <= n/2 ;i++){
	    		if(n%i==0){
	    			count++;
	    		}
	    	}
	    	return count;
	    }
}
