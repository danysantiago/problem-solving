import java.util.Scanner;


public class CowMultiplication1188 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] split = in.nextLine().split("\\s");
		String A = split[0];
		String B = split[1];
		
		long result = 0;
		for(int i = 0; i < A.length(); i++) {
			for(int j = 0; j < B.length(); j++) {
				result += (A.charAt(i) - '0') * (B.charAt(j) - '0');
			}
		}
		
		System.out.println(result);
		
	}

}
