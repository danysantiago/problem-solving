import java.util.ArrayList;
import java.util.Scanner;


public class PolynomialShowdown392 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<int[]> cases = new ArrayList<int[]>();
		
		try {
			String line;
			while(true) {
				line = in.nextLine();
				
				line = line.replaceAll("\\s+", " ");
				String[] split = line.split("\\s");
				
				int[] coefs = new int[split.length];
				
				for(int i = 0; i < split.length; i++) {
					coefs[i] = Integer.parseInt(split[i]);
				}
				
				cases.add(coefs);
			}
		} catch (Exception e) {}
		
		for(int i = 0; i < cases.size(); i++) {
			int zeroCoefs = 0;
			int[] coefs = cases.get(i);
			int coefsSize = coefs.length-1;
			
			String answer = "";
			
			for(int j = 0; j < coefs.length; j++, coefsSize--) {
				if(coefs[j] != 0) {
					if(zeroCoefs == 0) {
						if (coefs[j] < 0) {
							answer += "-";
						}
					} else {
						if (coefs[j] < 0) {
							answer += " - ";
						} else {
							answer += " + ";
						}
					}
					
					if (j < coefs.length-1) {
						if (coefs[j] != 1 && coefs[j] != -1) {
							answer += (int) Math.abs(coefs[j]);
						}
					} else {
						answer += (int) Math.abs(coefs[j]);
					}

					if (j < coefs.length-2) {
						answer += "x^" + coefsSize;
					} else if (j == coefs.length-2){
						answer += "x";
					}
					
					zeroCoefs++;
				}
			}
			
			if(zeroCoefs == 0) {
				answer += "0";
			}
			
			System.out.println(answer);
		}
	}

}
