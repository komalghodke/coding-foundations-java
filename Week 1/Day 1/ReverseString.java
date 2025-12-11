package practice.programs;

import java.util.Arrays;

public class ReverseString {


	public static void reversed(Character[] str) {
		int left = 0;
		int right = str.length-1;
		
		if(left<right) {
			char temp = str[left];
			str[left] = str[right];
			str[right] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		
		Character[] str = {'h','e','l','l','o'};
		System.out.println("Before reverse:");
	    System.out.println(Arrays.toString(str));
	    reversed(str);
	    System.out.println("After reverse:");
	    System.out.println(Arrays.toString(str));
	}
}
