package practice.programs;

public class removeElement {

	public static int removeEle(int[] nums, int val) {
		
		int k = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		System.out.print("Modified Array:");
		for (int i = 0; i < k; i++) {
		        System.out.print(nums[i] + " ");
		    }
		return k;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		System.out.println("\nThe number of elements in nums which are not equal to val:" + removeEle(nums, val));

	}
}
