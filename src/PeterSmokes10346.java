import java.util.Scanner;


public class PeterSmokes10346 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			while(true) {
				String[] split = in.nextLine().split("\\s");
				
				if(split.length == 0) {
					break;
				}
				
				int n = Integer.parseInt(split[0]);
				int k = Integer.parseInt(split[1]);
				
				int answer = 0;
				while(n > 0) {
					if(n/k > 0) {
						int div = n/k;
						answer += k*(div);
						n = n - k*(div) + div;
					} else {
						answer += n;
						n -= n;
					}
				}
				
				System.out.println(answer);
			}
		} catch (Exception e) {}
	}

}
