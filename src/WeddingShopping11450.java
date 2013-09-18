
public class WeddingShopping11450 {

	/**
	 * f[i,j] = max price buying garments from o..i with budget j
	 * f[i,0] = 0
	 * f[C-1,M] will give solution to problem
	 * f[i,j] = max(i<=m<=k | c[i,m]<= j) = c[i,m] + f[i-1,j-c[i,m]]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
