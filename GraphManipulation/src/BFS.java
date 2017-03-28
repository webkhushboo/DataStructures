import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BFS {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        */
 
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        boolean[] visited = new boolean[N];
        List<Integer> levels = new ArrayList<Integer>();
        levels.add(1);
        visited[0] = true;
        LinkedList[] arrayOfLists = new LinkedList[N];
        arrayOfLists[0] = new LinkedList<Integer>();
 
        for (int i = 0; i < N - 1; i++) {
            int a = s.nextInt() - 1;
            int b = s.nextInt() - 1;
            if (arrayOfLists[a] == null) {
                arrayOfLists[a] = new LinkedList<Integer>();
            }
            arrayOfLists[a].add(b);
            if (arrayOfLists[b] == null) {
                arrayOfLists[b] = new LinkedList<Integer>();
            }
            arrayOfLists[b].add(a);
        }
 
        int x = s.nextInt();
        if (x == 1)
            System.out.println(1);
        else if (x == 2)
            System.out.println(arrayOfLists[0].size());
        else {
            List<Integer> layeredList = new ArrayList<Integer>();
            Iterator<Integer> iter = arrayOfLists[0].iterator();
            int num;
            while (iter.hasNext()) {
                num = iter.next();
                layeredList.add(num);
                visited[num] = true;
            }
 
            List<Integer> tempList = new ArrayList<Integer>();
            for (int i = 2; i < x; i++) {
                //while (layeredList.size() != 0) {
                tempList = new ArrayList();
                iter = layeredList.iterator();
                while (iter.hasNext()) {
                    int current = iter.next();
                    visited[current] = true;
                    Iterator<Integer> innerIter = arrayOfLists[current].iterator();
                    while (innerIter.hasNext()) {
                        int k = innerIter.next();
                        if (!visited[k])
                            tempList.add(k);
                    }
                }
                layeredList.clear();
                for (int j = 0; j < tempList.size(); j++) {
                    layeredList.add(tempList.get(j));
                }
            }
            System.out.println(layeredList.size());
 
        }
    }
 
}
