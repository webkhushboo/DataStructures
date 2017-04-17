import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {

	public static int numberNeeded(String first, String second) {
	
	/*ArrayList<Character> list = new ArrayList<Character>();
	for(int i= 0; i<first.length();i++){
		list.add(first.charAt(i));
	}
	for(int j= 0;j <second.length();j++){
		if(list.contains(second.charAt(j))){
			int a = list.indexOf(second.charAt(j));
			list.remove(a);
		}
		else
		{
			list.add(second.charAt(j));
		}
	}
		return list.size(); */
		char[] A = first.toCharArray();
		char[] B = second.toCharArray();
		int[] diffs = new int['z' - 'a' + 1];
        for(char c : A){
            diffs[c - 'a']++;
        }
        for(char c : B){
            diffs[c - 'a']--;
        }
        int sum = 0;
        for(int diff : diffs){
            sum += (diff < 0) ? -diff : diff;
        }
        
        return sum;
	      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
