import java.util.Scanner;


public class Genetic2440 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			String split[] = in.nextLine().split("\\s");
			
			String m = split[0];
			String n = split[1];
			
			if(m.contains(n) && m.contains("T")) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}

}
