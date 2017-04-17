import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RansomNotes {

	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNotes(String magazine, String note) {
        magazineMap = new HashMap<String ,Integer>();
        String[]  magazineArr = magazine.split(" ");
        for(int i =0;i < magazineArr.length;i++){
        	if(!magazineMap.containsKey(magazineArr[i])){
        		magazineMap.put(magazineArr[i],1);
        	}
        	else {
        		int  value = magazineMap.get(magazineArr[i]);
        		magazineMap.put(magazineArr[i], value+1);
        	}
        }
        noteMap = new HashMap<String,Integer>();
        String[]  noteArr = note.split(" ");
        for(int i =0;i < noteArr.length;i++){
        	if(!noteMap.containsKey(noteArr[i])){
        		noteMap.put(noteArr[i],1);
        	}
        	else {
        		int  value = noteMap.get(noteArr[i]);
        		noteMap.put(noteArr[i], value+1);
        	}
        }
    }
    
    public boolean solve() {
    	Iterator entries = noteMap.entrySet().iterator();
    	while(entries.hasNext()){
    		Entry thisEntry = (Entry) entries.next();
    		int NoteMapvalue = noteMap.get(thisEntry.getKey());
    		int mazanineMapValue  = magazineMap.get(thisEntry.getKey());
    		if(!magazineMap.containsKey(thisEntry.getKey()) ||NoteMapvalue > mazanineMapValue ){
    			return false;
    		}
    	}
    	return true;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNotes s = new RansomNotes(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }

}
