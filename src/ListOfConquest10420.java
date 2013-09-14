import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//Problem link: http://uva.onlinejudge.org/external/104/10420.html
public class ListOfConquest10420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numOfLines = Integer.parseInt(in.nextLine());
		
		//The key to this problem is the data structure used, a HashMap of the countries with a
		//HashSet with the names of the girls.
		HashMap<String, HashSet<String>> superMap = new HashMap<String, HashSet<String>>();
		
		for(int i = 0; i < numOfLines; i++) {
			String line = in.nextLine();
			int indexOfSpace = line.indexOf(' ');
			String country = line.substring(0, indexOfSpace);
			String name = line.substring(indexOfSpace+1);
			if(superMap.containsKey(country)) {
				superMap.get(country).add(name);
			} else {
				HashSet<String> set = new HashSet<String>();
				set.add(name);
				superMap.put(country, set);
			}
		}
		
		//Sorting can be easily done with Java, performance is good enough here.
		ArrayList<String> countries = new ArrayList<String>(superMap.keySet());
		Collections.sort(countries);
		
		for(int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i) + " " + superMap.get(countries.get(i)).size());
		}

	}

}
