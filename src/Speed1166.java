import java.util.Scanner;


public class Speed1166 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			int nums = Integer.parseInt(in.nextLine());
			int even = 0;
			int odd = 0;
			
			for(int j = 0; j < nums; j++) {
				if(in.nextInt() % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			
			in.nextLine();
			
			System.out.println(even + " even and " + odd + " odd.");
		}
	}

}
