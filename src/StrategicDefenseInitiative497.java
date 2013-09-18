import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StrategicDefenseInitiative497 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int cases = Integer.parseInt(reader.readLine());
		reader.readLine();

		for (int x = 0; x < cases; x++) {
			ArrayList<Integer> missles = new ArrayList<Integer>();

			while (reader.ready()) {
				try {
					missles.add(Integer.parseInt(reader.readLine()));
				} catch (Exception e) {
					break;
				}
			}

			if (missles.size() == 0) {
				System.out.println("Max hits: " + 0);

				if (x < cases - 1) {
					System.out.println();
				}

				continue;
			}

			
			int[] counts = new int[missles.size()];
			int[] prev = new int[missles.size()];
			int maxLength = 1, bestEnd = 0;
			
			counts[0] = 1;
			prev[0] = -1;

			for (int i = 1; i < counts.length; i++) {
				counts[i] = 1;
				prev[i] = -1;

				for (int j = i - 1; j >= 0; j--) {
					if (counts[j] + 1 > counts[i] && missles.get(j) < missles.get(i)) {
						counts[i] = counts[j] + 1;
						prev[i] = j;
					}
				}

				if (counts[i] > maxLength) {
					bestEnd = i;
					maxLength = counts[i];
				}
			}

			System.out.println("Max hits: " + maxLength);
			
			String list = "";
			while(bestEnd != -1) {
				list = missles.get(bestEnd) + "\n" + list;
				bestEnd = prev[bestEnd];
			}
			
			System.out.print(list);


			if (x < cases - 1) {
				System.out.println();
			}

		}

	}

}
