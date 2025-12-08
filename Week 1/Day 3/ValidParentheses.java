package practice.programs;

import java.util.Stack;

/**
 * 
 * ValidParentheses
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Dec 8, 2025
 * @description Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if(ch==')' && top!='(') return false;
                if(ch=='}' && top!='{') return false;
                if(ch==']' && top!='[') return false;
            }
        }
        return st.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
        System.out.println(isValid("([)]")); 
	}
}
