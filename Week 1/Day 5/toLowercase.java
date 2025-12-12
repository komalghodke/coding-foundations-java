package practice.programs;

public class toLowercase {
	
	/**
	 * 
	 * toLowercase
	 *
	 * @param s
	 * @return String lowercase
	 */
	
    /*  A->65, B->66, Z->90
    a->97, b->98, z->122
    The difference between uppercase and lowercase letters is the same for letters.
    A-a = 97-65 = 32;
    so, lowercase = uppercase +32
     */
	
	public static String toLowerCase(String s) {
		
		StringBuilder result = new StringBuilder();
		
		for(char ch: s.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				ch = (char) (ch+32);
			}
			result.append(ch);
		}
		return result.toString();
		//return s.toLowerCase();
	}

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println("Lowercase of " + s + "\n Is: " + toLowerCase(s));
	}
}
