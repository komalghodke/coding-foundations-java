package practice.programs;

import java.util.Arrays;

/**
 * 
 * removeDuplicates
 *
 * @author Komal G
 * @github https://github.com/komalghodke
 * @created Dec 9, 2025
 * @description Remove Duplicates from Sorted Array
 */
public class removeDuplicates {
	
	private static int Duplicates(int[] nums) {
		if(nums.length==0) { return 0;}
        int i = 0;
        for(int j=1; j<nums.length; j++) {
            if(nums[j]!=nums[i]) {
                i++;
                nums[i] = nums[j];
            }  
        }          
        return i+1;
	}

	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,4,5,6,7,64,6,5,7,5};		
		Arrays.sort(nums);
		int k = Duplicates(nums);
		int[] nums2 = {1,2,3,3,4,5,6,7,7,7,8,9,9};
        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        int k2 = Duplicates(nums2);
        System.out.println("Unique count: " + k2);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }

	}

}
