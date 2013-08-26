import java.util.ArrayList;
import java.util.Scanner;


public class TheSkylineProblem105 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line;
		
		int[] coordinates = new int[20000];
		
		try {
			while (true) {
				line = in.nextLine();
				String[] split = line.split("\\s");
					
				int l = Integer.parseInt(split[0]);
				int h = Integer.parseInt(split[1]);
				int r = Integer.parseInt(split[2]);
				
				for(int i = l*2; i <= r*2; i++) {
					if(coordinates[i] < h) {
						coordinates[i] = h;
					}
				}
			}
		} catch (Exception e) {}
		
		String answer = "";
		int remem = 0;
		for(int i = 0; i < coordinates.length; i++) {
			if (coordinates[i] != remem) {
				if(i%2 == 0) {
					answer += i/2 + " " + coordinates[i] + " ";	
				} else {
					answer += (i-1)/2 + " " + coordinates[i] + " ";	
				}
				remem = coordinates[i];
			} 
		}
		
		System.out.println(answer.substring(0, answer.length()-1));

	}

}
