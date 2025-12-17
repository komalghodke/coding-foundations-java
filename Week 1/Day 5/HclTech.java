package practice.programs;

import java.util.Arrays;

/**
 * 
 * HclTech
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Dec 17, 2025
 * @description Inputs : 
		ather@their
		heart@earth
		compare the chars of "ather" with "their" or "heart" with "earth"
		If both words has same chars, return 1 else 0
 */
public class HclTech {

	public static void main(String[] args) {
		String st = "hello"; //define here String st = new String("hello");
		String st1 = "hello"; //define here String st1 = new String("hello");
		if(st==st1) {
			System.out.println("are eqaul");
			}
		else {
			System.out.println("NOT equal");
			}
		if(st.equals(st1)) {
			System.out.println(" both are equal");
			}
		    
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		// Arrays.stream(nums).filter(x->x%2==0).foreach(System.out.print(x));
		Arrays.stream(nums).filter(x->x%2!=0).forEach(System.out :: print);
		System.out.println("\n");
		
/*		Inputs : 
		ather@their
		heart@earth
		compare the chars of "ather" with "their" or "heart" with "earth"
		If both words has same chars, return 1 else 0*/
// 		My false code
//		String inp = new String("ather@their");
//		char[] inpIS = inp.toCharArray();
//		// if(inp.contains('@')) {
//		// inpIS.charA
//		// }
//		//String str1 = inp.substring(0, )
//		String str = inpIS.split('@');
//		//char c: inpIS
//		for(int i = 0; i<inpIS.length(); i++) {
//		// int current = inpIs.get(inpIs.charAt(i));
//			int left = inpIS[0];
//		    int righ = inpIS[inpIS.length-1];
//		    while(inp[i]!='@') {
//		    // if(inp[i]==inpIs.get(chartAt(inpIS.length-1))) {return 1;}
//		    // else {return 0;}
//		    if(left!=right) {
//		    	return 1;
//		    	} else {
//		    		return 0;
//		            }
//		    left++;
//		    right--;
//		    }
//		    }
		
		//Correct Program is Below
		String inp = "ather@their";
		String[] parts = inp.split("@");

		String s1 = parts[0];
		String s2 = parts[1];

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if(Arrays.equals(a, b)) {
		    System.out.println(1);
		} else {
		    System.out.println(0);
		}

		//int result = Arrays.equals(a, b) ? 1 : 0; System.out.println(result);
		
	}
}
