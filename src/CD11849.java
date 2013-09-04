import java.util.HashSet;
import java.util.Scanner;


public class CD11849 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] line1 = in.nextLine().split("\\s");
		int n = Integer.parseInt(line1[0]);
		int m = Integer.parseInt(line1[1]);
		
		HashSet<Integer> cdMap = new HashSet<Integer>();
		int duplicates = 0;
		
		for(int i = 0; i < n; i++) {
			cdMap.add(Integer.parseInt(in.nextLine()));
		}
		
		for(int i = 0; i < m; i++) {
			int catNum = Integer.parseInt(in.nextLine());
			if(cdMap.contains(catNum)) {
				duplicates++;
			}
		}
		
		System.out.println(duplicates);
	}

}
