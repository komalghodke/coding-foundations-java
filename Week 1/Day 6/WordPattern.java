package practice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) return false;
                } else {
                    if (!set.add(w)) return false;
                    map.put(c, w);
                    }
                } return true;
            }

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog")); // true
		System.out.println(wordPattern("abba", "dog cat cat fish")); // false
		System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
	}

}
