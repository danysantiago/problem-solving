import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IncreasingOrderList1495 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>(cases);
		for(int i = 0; i < cases; i++) {
			arr.add(Integer.parseInt(in.nextLine()));
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());

	}

}
