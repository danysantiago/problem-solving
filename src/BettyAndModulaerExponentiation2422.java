import java.util.Scanner;


public class BettyAndModulaerExponentiation2422 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cases; i++) {
			String[] split = in.nextLine().split("\\s");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			
			System.out.println(modulo(a, b, 1000000000));
			
		}
	}
	
	public static int modulo(int a,int b,int c) {
	    long x=1;
	    long y=a;
	    while(b > 0){
	        if(b%2 == 1){
	            x=(x*y)%c;
	        }
	        y = (y*y)%c;
	        b /= 2;
	    }
	    return (int) x%c;
	}

}
