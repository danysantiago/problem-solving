import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Chain1292 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			String A = in.nextLine();
			String B = in.nextLine();
			
			int count = 0;
			int[] arr = new int[B.length()-1];
			
			int base = A.length() - B.length();
			while(arr[arr.length-1] < base-1) {
				
				String regex = "";
				for(int x= 0; x < B.length(); x++) {
					regex += B.charAt(x);
					if(x < B.length()-1) {
						regex += ".{" + arr[x] + "}";
					}
				}
				
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(A);
				
				while(m.find()) {
					count++;
				}
				
				plusplus(arr, 0, base);
				
			}
			
			System.out.println(count);
		}

	}

	private static void plusplus(int[] arr, int i, int base) {
		arr[i]++;
		if(arr[i] == base) {
			arr[i] = 0;
			plusplus(arr, i+1, base);
		}
		
	}

}
