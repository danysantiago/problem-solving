import java.util.Scanner;


public class Sum1049 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		if(N < 0) {
			System.out.println( (N*(-N+1)) / 2 + 1);
		} else {
			System.out.println( (N*(N+1)) / 2);
		}

	}

}
