import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class WhatCryptanalysis10008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < n; i++) {
			String line = in.nextLine().toUpperCase();
			
			for(int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);
				if(c >= 65 && c <= 90) {
					if(map.containsKey(c)) {
						map.put(c, map.get(c) + 1);
					} else {
						map.put(c, 1);
					}
				}
			}
		}
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> a, Entry<Character, Integer> b) {
				int cmp1 = b.getValue().compareTo(a.getValue());
		        if (cmp1 != 0) {
		            return cmp1;
		        } else {
		            return a.getKey().compareTo(b.getKey());
		        }
			}
		});
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
		}

	}

}
