import java.util.Scanner;

public class WordScarmble483 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String line;

		try {
			while (true) {
				line = in.nextLine();

				if (line.length() == 0) {
					break;
				}

				String[] split = line.split("\\s");
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < split.length; i++) {

					for (int j = split[i].length() - 1; j >= 0; j--) {
						sb.append(split[i].charAt(j));
					}

					if (i < split.length - 1) {
						sb.append(" ");
					}
				}

				System.out.println(sb.toString());
			}
		} catch (Exception e) {}

	}

}
