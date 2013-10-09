import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllinAll10340 {
	public static void main(String[] args) throws IOException {
		// Read all input. Solve the problems individually.
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		do {
			String line = reader.readLine();
			String[] splitLine = line.split(" ");
			System.out.println(solve(splitLine[0], splitLine[1]));
		} while (reader.ready());
	}
	
	public static String solve(String target, String s) {
		// Match all chars from target.
		int index = 0;
		for (int i = 0; i < target.length(); i++) {
			for (; index < s.length(); index++) {
				if (s.charAt(index) == target.charAt(i)) {
					// Update index only if this is not the last letter at s.
					if (index != s.length() - 1) {
						index++;
					}
					break;
				} else {
					continue;
				}
			}

			// Not all characters were matched in sequence.
			if (index == s.length()) {
				return "No";
			}
		}

		// All characters were matched in sequence.
		return "Yes";
	}
}
