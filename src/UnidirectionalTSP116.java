import java.util.Scanner;


public class UnidirectionalTSP116 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			int m;
			int n;
			int[][] matrix;
			
			try {
				String[] lineOne = in.nextLine().split("\\s");
				m = Integer.parseInt(lineOne[0]);
				n = Integer.parseInt(lineOne[1]);

			
				matrix = new int[m][n];
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						matrix[i][j] = in.nextInt();
					}
				}
				in.nextLine();
			
			} catch (Exception e) {
				break;
			}
			
			//Drag the min to the 1st column
			for(int j = n - 2; j >= 0; j--) {
				for(int i = 0; i < m; i++) {
					int[] paths = new int[3];
					paths[0] = (i-1) == -1 ? matrix[m-1][j+1] : matrix[i-1][j+1];
					paths[1] = matrix[i][j+1];
					paths[2] = (i+1) == m ? matrix[0][j+1] : matrix[i+1][j+1];
					matrix[i][j] += Math.min(Math.min(paths[0], paths[1]), paths[2]);
				}
			}
			
			//Find min in 1st columns
			int min = Integer.MAX_VALUE;
			int[] minPath = new int[n];
			for(int i = m-1; i >= 0; i--) {
				if(matrix[i][0] <= min) {
					min = matrix[i][0];
					minPath[0] = i;
				}
			}
			
			for(int j = 1; j < n; j++) {
				int inMinPath = Integer.MAX_VALUE;
				for(int x = 1; x >= -1; x--) {
					
					int i = minPath[j-1] + x;
					if(i == -1) {
						i = m-1;
					} else if (i == m) {
						i = 0;
					}
					
					if(matrix[i][j] <= inMinPath) {
						if(matrix[i][j] == inMinPath) {
							if(i < minPath[j]) {
								minPath[j] = i;
							}
						} else {
							inMinPath = matrix[i][j];
							minPath[j] = i;
						}
					}
				}
			}
			
			for(int j = 0; j < n; j++) {
				System.out.print(minPath[j]+1);
				if(j < n-1) {
					System.out.print(" ");
				}
			}
			System.out.println("\n" + min);
		}

	}

}
