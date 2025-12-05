package practice.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * LongestSubstring
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Dec 5, 2025
 * @description Finds the longest substring without repeating characters.
 */

public class LongestSubstring {


	/**
	 * 
	 * LongestSubstring
	 *
	 * @param Input String s
	 * @return SubString
	 */
	
	public static String longestSubstring(String s) {
		Map<Character, Integer> lastIndex = new HashMap<>();
		int left = 0, maxLen = 0, start = 0;
		for(int right=0; right<s.length(); right++) {
			char c = s.charAt(right);
			
			if(lastIndex.containsKey(c) && lastIndex.get(c) >= left) {
				left =  lastIndex.get(c);
			}
			
			lastIndex.put(c, right);
			
			 if (right - left + 1 > maxLen) {
	                maxLen = right - left + 1;
	                start = left;
	            }
	        }
		return s.substring(start, start + maxLen);
	}

	public static void main(String[] args) {
		String s = "abcccacba";
        System.out.println("Longest substring: " + longestSubstring(s));
        
	}
}
