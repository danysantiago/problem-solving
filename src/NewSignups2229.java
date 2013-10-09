import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//http://coj.uci.cu/practice/vproblem.xhtml?abb=2229
public class NewSignups2229 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String line1 = in.nextLine();
			String line2 = in.nextLine();
			
			int length1 = line1.length();
			int length2 = line2.length();
			
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i = 0; i < line1.length(); i++) {
				char c = line1.charAt(i);
				if(map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			
			int moves = 0;
			for(int i = 0; i < line2.length(); i++) {
				char c = line2.charAt(i);
				if(map.containsKey(c)) {
					length1--;
					length2--;
					map.put(c, map.get(c) - 1);
				} else {
					map.put(c, 1);
				}
			}
			
			moves += Math.abs(length1-length2);
			ArrayList<Map.Entry<Character, Integer>> arr = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
			int meh = moves;
			int i = 0;
			while(meh > 0) {
				while(arr.get(i).getValue() > 0 && meh > 0) {
					arr.get(i).setValue(arr.get(i).getValue() - 1);
					meh--;
				}
				i++;
			}
			
			for(int j = 0; j < arr.size(); j++) {
				moves += arr.get(j).getValue();
			}
			
			System.out.println(moves);
		}

	}

}
