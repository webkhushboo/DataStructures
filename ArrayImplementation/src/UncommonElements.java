import java.io.*;
import java.util.*;

public class UncommonElements {
	public static String uncommonBetweenCommon(int[] input1, int[] input2) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for(int i=0;i <input1.length ;i++){
			list.add(input1[i]);
		}
		for(int i=0;i <input2.length ;i++){
			list2.add(input2[i]);
		}
		list3.addAll(list);
		list3.addAll(list2);
		list.retainAll(list2);
        list3.removeAll(list);
		String str ="";
		for(int elem : list3){
			if(elem != list3.get(list3.size()-1))
			str+=elem+"$";
			else 
			str+= elem;
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String output;
		int ip1[] = new int[] { 1, 2, 3, 4, 5 };
		int ip2[] = new int[] { 3, 4, 5, 6, 7 };
		output = uncommonBetweenCommon(ip1, ip2);
		System.out.println(String.valueOf(output));
	}

}
