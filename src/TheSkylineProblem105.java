import java.util.Scanner;

//Problem link: http://uva.onlinejudge.org/external/1/105.html
public class TheSkylineProblem105 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line;
		
		//Create coordinates line, it is twice the max size so
		//we can handle in-between heights
		int[] coordinates = new int[20000];
		
		try { //Lazy try-catch to avoid input problems 
			while (true) {
				line = in.nextLine();
				String[] split = line.split("\\s");
				
				//Read buildings info
				int l = Integer.parseInt(split[0]);
				int h = Integer.parseInt(split[1]);
				int r = Integer.parseInt(split[2]);
				
				//Place heights of building in coordinates
				//only if bigger than one already there,
				//we are building the skyline...
				for(int i = l*2; i <= r*2; i++) {
					if(coordinates[i] < h) {
						coordinates[i] = h;
					}
				}
			}
		} catch (Exception e) {}
		
		String answer = "";
		int remem = 0;
		//Output is constructed from the coordinates array containing
		//tallest height at such coordinate. We use the remem variable,
		//to remember last printing height, part of the output specs
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
