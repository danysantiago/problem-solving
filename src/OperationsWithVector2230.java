import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class OperationsWithVector2230 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			A.add(in.nextInt());
		}
		
		in.nextLine();
		
		for(int i = 0; i < n; i++) {
			B.add(in.nextInt());
		}
		
		in.nextLine();
		
		Collections.sort(A);
		Collections.sort(B);
		
		long sum = 0;
		for(int i = 0, j = n - 1; i < n; i++, j--) {
			sum += A.get(i)*B.get(j);
		}
		
		System.out.println(sum);

	}

}
