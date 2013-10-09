import java.util.Scanner;


public class DotaWarlockPower1480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		
		Coor[] coors = new Coor[N];
		for(int i = 0; i < N; i++) {
			String[] split = in.nextLine().split("\\s");
			coors[i] = new Coor(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
		}
		
		//create adj matrix
		double[][] matrix = new double[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matrix[i][j] = Coor.distance(coors[i], coors[j]);
			}
		}
		
		int[] source = new int[N]; // i-th element contains number of source vertex for the edge with the lowest cost from tree T to vertex i
	    double[] dist = new double[N]; //i-th element contains weight of minimal edge connecting i with source[i] 
	    boolean[] indicators = new boolean[N];  //if true, vertex i is in tree T

	    // Mark all vertices as NOT being in the minimum spanning tree
	    for (int i = 0; i < N; i++) {
	        indicators[i] = false;
	        dist[i] = Double.POSITIVE_INFINITY;
	    }

	     //we start with vertex number 0
	    indicators[0] = true;
	    dist[0] = 0;
	    int bestNeighbour = 0;// lastly added vertex to the tree T 
	    double minDist; 

	    for (int i = 0; i < N - 1; i++) {
	        minDist = Double.POSITIVE_INFINITY;

	        for (int j = 0; j < N; j++) {// fill dist[] based on distance to bestNeighbour vertex
	            if (!indicators[j]) {
	                double weight = matrix[bestNeighbour][j];

	                if (weight < dist[j]) {
	                    source[j] = bestNeighbour;
	                    dist[j] = weight;
	                }
	            }
	        }

	        for (int j = 0; j < N; j++) {// find index of min in dist[]
	            if (!indicators[j]) {
	                if (dist[j] < minDist) {
	                    bestNeighbour = j;
	                    minDist = dist[j];
	                }
	            }
	        }

	        if (bestNeighbour != 0)
	        {//add the edge (bestNeighbour, dist[bestNeighbour]) to tree T
	            indicators[bestNeighbour] = true;
	        }

	    }
	    
	    double solution = 0;
	    for(int i = 0; i < N; i++) {
	    	solution += dist[i];
	    }
	    
	    solution = solution * 5;
	    System.out.printf("%.2f", solution);
	}
	
	public static class Coor {
		public double x;
		public double y;
		
		public Coor(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public static double distance(Coor c1, Coor c2) {
			double sub1 = c2.x - c1.x;
			sub1 = sub1*sub1;
			double sub2 = c2.y - c1.y;
			sub2 = sub2*sub2;
			return Math.sqrt(sub1 + sub2);
			
		}
	}

}
