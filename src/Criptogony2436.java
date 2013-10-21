import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Criptogony2436 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			in.nextLine();
			
			String[] mChars = in.nextLine().split("\\s");
			
			String msgB = in.nextLine();
			char[] msg = new char[m];
			for(int x = 0; x < m; x++) {
				msg[x] = msgB.charAt(x);
			}

			HashMap<Character, Integer> count = new HashMap<Character, Integer>();
			for(int x = 0; x < msg.length; x++) {
				char c = msg[x];
				if(count.containsKey(c)) {
					count.put(c, count.get(c) + 1);
				} else {
					count.put(c, 1);
				}
			}
			
			List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(count.entrySet());
			Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

				@Override
				public int compare(Entry<Character, Integer> a, Entry<Character, Integer> b) {
					return b.getValue().compareTo(a.getValue());
				}
			});
			
			boolean[] replaced = new boolean[m];
			for(int x = 0; x < m && x < list.size(); x++) {
				for(int y = 0; y < m; y++) {
					if(msg[y] == list.get(x).getKey() && !replaced[y]) {
						msg[y] = mChars[x].charAt(0);
						replaced[y] = true;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(msg);
			System.out.println(sb.toString());
		}

	}

}
