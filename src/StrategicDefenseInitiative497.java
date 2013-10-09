import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class StrategicDefenseInitiative497 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(reader.readLine());
		reader.readLine();
		
		for(; cases > 0; cases--) {
		
			ArrayList<Integer> missles = new ArrayList<Integer>();
			
			while(true) {
				try {
					if(reader.ready()) {
						missles.add(Integer.parseInt(reader.readLine()));
					} else {
						break;
					}
				} catch (Exception e) {
					break;
				}
			}
			
			int[] counts = new int[missles.size()];
			boolean[] taken = new boolean[missles.size()];
			int maxH = 0;
			
			for(int i = 0; i < missles.size(); i++) {
				if(i == 0) {
					counts[i] = 0;
				} else {
					counts[i] = counts[i-1];
				}
				
				if (missles.get(i) <= maxH) {
					int j = i-1;
					while(j >= 0) {
						if(taken[j]) {
							if(missles.get(j) > missles.get(i)) {
								taken[j] = false;
								counts[i]--;
								j--;
							} else {
								break;
							}
						} else {
							j--;
						}
					}
				}
				
				maxH = missles.get(i);
				counts[i]++;
				taken[i] = true;
			}
			
			int maxCount = 0;
			int maxIndex = 0;
			for(int i = 0; i < counts.length; i++) {
				if(counts[i] > maxCount) {
					maxCount = counts[i];
					maxIndex = i;
				}
			}
			
			System.out.println("Max hits: " + maxCount);
			if(maxCount != 0) {
				maxH = missles.get(maxIndex);
				for(int i = 0; i <= maxIndex ; i++) {
					if(missles.get(i) <= maxH) {
						System.out.println(missles.get(i));
					}
				}
			}
			
			if(cases > 1) {
				System.out.println();
			}
		
		}
	}

}
