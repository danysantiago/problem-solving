import java.util.Scanner;


public class BinaryCheckSum2380 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			String b = Integer.toBinaryString(in.nextInt());
			for(int x = 0; x < b.length(); x++) {
				if(b.charAt(x) == '1') {
					sum++;
				}
			}	
					
			in.nextLine();
		}
		
		System.out.println(sum);
	}

}
