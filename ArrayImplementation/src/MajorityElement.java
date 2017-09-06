import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	private static void findMajority(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
 
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        System.out.println("Majority found :- " + arr[i]);
                        return;
                    } else
                        map.put(arr[i], count);
 
            }
            else
                map.put(arr[i],1);
            }
            System.out.println(" No Majority element");
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
        findMajority(arr);
    }
}
