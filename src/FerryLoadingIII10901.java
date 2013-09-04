import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class FerryLoadingIII10901 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			String[] caseInfo = in.nextLine().split("\\s");
			int n = Integer.parseInt(caseInfo[0]);
			int t = Integer.parseInt(caseInfo[1]);
			int m = Integer.parseInt(caseInfo[2]);
			
			String[] timeArr = new String[10000];
			
			for(int j = 0; j < m; j++) {
				String line[] = in.nextLine().split("\\s");
				timeArr[Integer.parseInt(line[0])] = line[1];
			}
			
			PriorityQueue<String> leftQ = new PriorityQueue<String>();
			PriorityQueue<String> rightQ = new PriorityQueue<String>();
			boolean boatIsLeft = true;
			boolean boatIsInDock = true;
			
			for(int j = 0; j < timeArr.length; j++) {
				
			}
			

		}

	}

}
