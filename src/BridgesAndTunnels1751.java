import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;


public class BridgesAndTunnels1751 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
			int n = Integer.parseInt(in.nextLine());
			
			for(int j = 0; j < n; j++) {
				String[] bs = in.nextLine().split("\\s");
				String b1 = bs[0];
				String b2 = bs[1];
				
				if(graph.containsKey(b1)) {
					graph.get(b1).add(b2);
				} else {
					ArrayList<String> arr = new ArrayList<String>();
					arr.add(b2);
					graph.put(b1, arr);
				}
				
				if(graph.containsKey(b2)) {
					graph.get(b2).add(b1);
				} else {
					ArrayList<String> arr = new ArrayList<String>();
					arr.add(b1);
					graph.put(b2, arr);
				}
				
				System.out.println(bfs(graph, b1));
			}
		}

	}

	private static int bfs(HashMap<String, ArrayList<String>> graph, String b1) {
		int count = 0;
		HashSet<String> visited = new HashSet<String>();
		
		// DFS uses Stack data structure
		Stack<String> s = new Stack<String>();
		s.push(b1);
		visited.add(b1);
		count++;
		
		while(!s.isEmpty()) {
			ArrayList<String> node = graph.get(s.peek());
			String child = null;
			
			for(String c : node) {
				if(!visited.contains(c)) {
					child = c;
					break;
				}
			}
			
			if(child != null) {
				visited.add(child);
				count++;
				s.push(child);
				}
			else {
				s.pop();
			}
		}
		
		return count;
	}

}
