import java.util.Scanner;


public class ToCarryOrNotToCarry10469 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			while(true) {
				String[] split = in.nextLine().split("\\s");
				long num1 = Long.parseLong(split[0]);
				long num2 = Long.parseLong(split[1]);
				
				System.out.println(num1 ^ num2);
			}
		} catch (Exception e) {}

	}

}
