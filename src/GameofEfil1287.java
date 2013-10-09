import java.util.Scanner;


public class GameofEfil1287 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	while(true) {
		String[] line1 = in.nextLine().split("\\s");
		int m = Integer.parseInt(line1[0]);
		int n = Integer.parseInt(line1[1]);
		
		if(m == 0 && n == 0) {
			break;
		}
		
		boolean[][] matrix = new boolean[m][n];
		
		int k = Integer.parseInt(in.nextLine());
		for(int i = 0; i < k; i++) {
			String coords[] = in.nextLine().split("\\s");
			
			matrix[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] = true;
		}
		
		boolean[][] oldMatrix = new boolean[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				oldMatrix[i][j] = true;
				
				
				
				oldMatrix[i][j] = false;
			}
		}
	}

	}

}
