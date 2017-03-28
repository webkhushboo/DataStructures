import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PracticeBFS {

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	Boolean[] visitedQueue = new Boolean[N];
	visitedQueue[0] = true;
	LinkedList[] arrayOfLists = new LinkedList[N];	
	arrayOfLists[0] = new LinkedList<Integer>();
	
	for(int i=0;i<N-1;i++){
		int a = scan.nextInt() - 1;
		int b = scan.nextInt() - 1;
		if(arrayOfLists[a]== null){
			arrayOfLists[a] = new LinkedList<Integer>();
		}
		arrayOfLists[a].add(b);
		if(arrayOfLists[b] == null){
			arrayOfLists[b] = new LinkedList<Integer>();
		}
		arrayOfLists[b].add(a);
	}
	
	int level = scan.nextInt();
	if(level == 1){
		System.out.println(1);
	}
	else if(level == 2){
		System.out.println(arrayOfLists[0]);
	}
	else {
	 List<Integer> layeredList = new ArrayList<Integer>();
	 Iterator<Integer> itr = arrayOfLists[0].iterator();
	 while(itr.hasNext()){
		 int num = itr.next();
		 visitedQueue[num] =true;
		 layeredList.add(num);
	 }
	 for(int i=2;i<level;i++){
		 Iterator<Integer> iter = arrayOfLists[0].iterator();
		 while(iter.hasNext()){
			 int current = iter.next();
			 visitedQueue[current] =true;
			 List<Integer> tempList = new ArrayList<Integer>();
			 tempList = arrayOfLists[current];
			 Iterator<Integer> itr2 = tempList.iterator();
			 while(itr2.hasNext()){
				 int n = itr2.next();
				 if(!visitedQueue[n]){
					 tempList.add(n);
				 }
			 }
			 layeredList.clear();
			 for(int j =0; j<tempList.size();i++){
				 layeredList.add(tempList.get(j));
			 }
		 }
		 System.out.println(layeredList.size());
	 }
	}
	
}
}