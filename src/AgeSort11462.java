import java.util.Scanner;

//Problem link: http://uva.onlinejudge.org/external/114/11462.html
public class AgeSort11462 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String line = in.nextLine();
			if (line.equals("0")) { //Check if last case
				break;
			}
			
			int numOfAges = Integer.parseInt(line); //Read num of ages to expect
			int[] ages = new int[100]; //Counting array
			
			//Read ages
			for(int i = 0; i < numOfAges; i++) {
				ages[in.nextInt()]++;
			}
			
			//Build output:
			//Used StringBuilder because its faster than the immutable String object.
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i < 100; i++) {
				if(ages[i] > 0) {
					for(int j = 0; j < ages[i]; j++) {
						sb.append(i + " ");
					}
				}
			}
			sb.deleteCharAt(sb.length()-1); //Remove last space
			
			System.out.println(sb.toString());
			
			in.nextLine(); //nextInt() dosen't consume line break, we get it here.
		}

	}

}
