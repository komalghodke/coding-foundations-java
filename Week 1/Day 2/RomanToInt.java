package practice.programs;
import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = values.get(s.charAt(i));

            // Check if next symbol exists and is larger
            if (i + 1 < s.length() && current < values.get(s.charAt(i + 1))) {
                total -= current; // subtract rule
            } else {
                total += current; // normal add
            }
        }

        return total;
    }

    // Quick test
    public static void main(String[] args) {
    	RomanToInt sol = new RomanToInt();
        System.out.println(sol.romanToInt("III"));      // 3
        System.out.println(sol.romanToInt("LVIII"));    // 58
        System.out.println(sol.romanToInt("MCMXCIV"));  // 1994
    }
}
