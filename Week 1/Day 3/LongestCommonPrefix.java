package practice.programs;

import java.security.PublicKey;

/**
 * 
 * LongestCommonPrefix
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Dec 8, 2025
 * @description Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: strs = ["flower","flow","flight"] Output: "fl"
 */
public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length==0) {
			return "";
		}
		String prefix = strs[0];
		for(int i=1; i<strs.length; i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "fly"};
		System.out.println(longestCommonPrefix(strs));
 		
	}
}
