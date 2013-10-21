import java.util.Scanner;


public class InDebt2060 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int n = Integer.parseInt(in.nextLine());
			
			if(n == -1) {
				break;
			}
			
			int count = 0;
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += in.nextInt();
				if(sum % 100 == 0) {
					count += 1;
					sum = 0;
				}
			}
			
			in.nextLine();
			
			System.out.println(count);
		}

	}

}
