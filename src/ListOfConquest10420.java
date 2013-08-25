import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class ListOfConquest10420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numOfLines = Integer.parseInt(in.nextLine());
		
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
		
		ArrayList<String> countries = new ArrayList<String>(superMap.keySet());
		Collections.sort(countries);
		
		for(int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i) + " " + superMap.get(countries.get(i)).size());
		}

	}

}
