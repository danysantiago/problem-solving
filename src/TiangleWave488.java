import java.util.ArrayList;
import java.util.Scanner;

//Problem Link: http://uva.onlinejudge.org/external/4/488.html
public class TiangleWave488 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Read input
		int cases = Integer.parseInt(in.nextLine());
		
		ArrayList<Integer> amps = new ArrayList<Integer>();
		ArrayList<Integer> freqs = new ArrayList<Integer>();
		
		for (int i = 0; i < cases; i++) {
			in.nextLine();
			amps.add(Integer.parseInt(in.nextLine()));
			freqs.add(Integer.parseInt(in.nextLine()));
		}
		
		String s; //Wave String
		
		for(int i = 0; i < cases; i ++) { //Cases loop
			
			s = "";
			
			// Upper half of wave
			for(int x = 1; x <= amps.get(i); x++) {
				for(int y = 0; y < x; y++) {
					s += x;
				}
				s += "\n";
			}
			
			// Lower half of wave
			for(int x = amps.get(i)-1; x > 0; x--) {
				for(int y = 0; y < x; y++) {
					s += x;
				}
				s += "\n";
			}
			
			// Print it the amount of freqs needed
			for(int j = 0; j < freqs.get(i); j ++) {
				System.out.print(s);
				if ( j < freqs.get(i) - 1) {
					System.out.print("\n");
				}
			}
			
			if ( i < cases-1) {
				System.out.println();
			}
			
		}
	}
	
}
