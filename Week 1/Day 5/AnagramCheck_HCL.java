package practice.programs;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck_HCL {
	
	public static int compareWords(String inp) {
		String[] parts = inp.split("@");
		String s1 = parts[0];
		String s2 = parts[1];
		
		if (s1.length() != s2.length()) return 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		// Count characters of first word
		for (char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
			}
		
		// Subtract characters of second word
		for (char c : s2.toCharArray()) {
			if (!map.containsKey(c)) return 0; // char not found
			map.put(c, map.get(c) - 1);
			if (map.get(c) < 0) return 0; // more occurrences in s2 }
		}
		
		return 1;
	}

	public static void main(String[] args) {
		//Anagram check using HashMap
		
		/*
		 * Inputs : ather@their heart@earth compare the chars of "ather" with "their" or
		 * "heart" with "earth" If both words has same chars, return 1 else 0
		 */
		
		System.out.println("heart@earth " + compareWords("heart@earth") );


	}

}
