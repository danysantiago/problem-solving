import java.util.ArrayList;
import java.util.Scanner;


public class CountOnCantor264 {
	
	static public ArrayList<Integer> rows = new ArrayList<Integer>();
	static public ArrayList<Integer> cols = new ArrayList<Integer>();
	static int rowMul = 2;
	static int colMul = 4;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		rows.add(1);
		rows.add(3);
		cols.add(1);
		cols.add(2);
		
		try {
			while(true) {
				int term = Integer.parseInt(in.nextLine());
				
				int rowIndex = 0;
				int colIndex = 0;
				
				while(term >= rows.get(rowIndex)) {
					rowIndex++;
					colIndex++;
					if(rows.size() == rowIndex) {
						if(rowIndex % 2 == 0) {
							rows.add(rows.get(rowIndex-1) + 1);
							cols.add(cols.get(colIndex-1) + colMul);
							colMul += 4;
						} else {
							rowMul += 4;
							rows.add(rows.get(rowIndex-1) + rowMul);
							cols.add(cols.get(colIndex-1) + +1);
						}
					}
				}
				
				if(term > cols.get(colIndex-1)) {
					term -= cols.get(colIndex-1);
				} else {
					colIndex--;
					term -= rows.get(rowIndex-1);
				}
				
				if((colIndex-1) % 2 == 0) {
					term--;
					rowIndex = 1;
					rowIndex += term;
					colIndex -= term;

				} else {
					colIndex = 1 ;
					rowIndex -= term;
					colIndex += term;
				}
				
				
				System.out.println("TERM " + term + " IS " + rowIndex + "/" + colIndex);
			}
		} catch (Exception e) {}

	}

}
