import java.util.Scanner;


public class PythagoreanNumbers1099 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int a = in.nextInt();
			
			if(a == 0) {
				break;
			}
			
			int b = in.nextInt();
			int c = in.nextInt();
			
			if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
			in.nextLine();
		}

	}

}
