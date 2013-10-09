import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Lotto441 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String[] line = in.nextLine().split("\\s");
			
			int k = Integer.parseInt(line[0]);
			
			if(k == 0) {
				break;
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 1; i < k + 1; i++) {
				list.add(Integer.parseInt(line[i]));
			}
			
			List<String> result = getSubsets(list, 6);
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
			
			System.out.println();
		}
	}
	
	private static void getSubsets(List<Integer> superSet, int k, int idx, Set<Integer> current, List<String> solution) {
	    //successful stop clause
	    if (current.size() == k) {
	    	Object[] bu = new HashSet<Integer>(current).toArray();
	    	Integer[] meh = Arrays.copyOf(bu, bu.length, Integer[].class);
	    	Arrays.sort(meh);
	    	StringBuilder sb = new StringBuilder();
	    	for(int i = 0; i < meh.length; i++) {
	    		sb.append(meh[i] + " ");
	    	}
	    	String string = sb.toString();
	        solution.add(string.substring(0, string.length()-1));
	        return;
	    }
	    //unseccessful stop clause
	    if (idx == superSet.size()) return;
	    Integer x = superSet.get(idx);
	    current.add(x);
	    //"guess" x is in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	    current.remove(x);
	    //"guess" x is not in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	}

	public static List<String> getSubsets(List<Integer> superSet, int k) {
	    List<String> res = new ArrayList<>();
	    getSubsets(superSet, k, 0, new HashSet<Integer>(), res);
	    return res;
	}

}
