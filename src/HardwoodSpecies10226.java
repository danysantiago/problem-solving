import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class HardwoodSpecies10226 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		in.nextLine();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < cases; i++) {
			map.clear();
			int count = 0;
			String line = in.nextLine();
			
			while (line.length() > 0) {
				if(map.containsKey(line)) {
					map.put(line, map.get(line) + 1);
				} else {
					map.put(line, 1);
				}
				
				count++;
				line = in.nextLine();
			}
			
			ArrayList<String> treeList = new ArrayList<String>(map.keySet());
			Collections.sort(treeList);
			
			for(int j = 0; j < treeList.size(); j++) {
				float result = (((float) map.get(treeList.get(j))) / count) * 100;
				String stringResult = String.format("%.4f", result);
				System.out.println(treeList.get(j) + " " + stringResult);
			}
			
			if(i < cases-1) {
				System.out.println();
			}
			
		}

	}

}
