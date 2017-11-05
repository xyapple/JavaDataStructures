package arraysAndstrings;
//217. Contains Duplicate
//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
//and it should return false if every element is distinct.

import java.util.Arrays;

public class containsDuplicate {

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5,6};
		
		isDuplicate(n);

	}
	public static boolean isDuplicate(int[] nums) {
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length-1; i++) {
			
			if(nums[i] == nums[i+1]) {
				System.out.println("This is duplicate");
				return true;
				
			} 
			
		}
		System.out.println("This is not a duplicate");
		return false;
	}

}
