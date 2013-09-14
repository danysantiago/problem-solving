import java.util.Scanner;

public class BoxOfBricks591 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long setNumber = 0;
		int n = scanner.nextInt();
		while (n != 0) {
			setNumber++;
			scanner.nextLine();
			int numOfBlocks = 0;
			int[] blocks = new int[50];
			int size = 0;
			for (int i = 0; i < n; i++) {
				int h = scanner.nextInt();
				numOfBlocks += h;
				blocks[i] = h;
				size++;
			}

			// Find height of stacks.
			int height = numOfBlocks / n;
			int answer = 0;
			for (int i = 0; i < size; i++) {
				if (blocks[i] > height) {
					answer += blocks[i] - height;
				}
			}
			System.out.println("Set #" + setNumber);
			System.out
					.println("The minimum number of moves is " + answer + ".");
			scanner.nextLine();
			n = scanner.nextInt();
			System.out.println();
		}
	}

}
