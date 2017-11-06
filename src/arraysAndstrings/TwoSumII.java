package arraysAndstrings;

import java.util.Arrays;

//Two Sum II – Input array is sorted
//Similar to Question [1. Two Sum], except that the input array is already sorted in ascending order.
public class TwoSumII {
	
	public static void main(String[] args) {
		int[] test = {2, 7, 11, 15};
		//Arrays.sort(test);
		sumOfTwoSorted(test, 9);
		
	}
	public static int sumOfTwoSorted(int[] nums, int target){
		//check the input 
		if(nums==null || nums.length==0) return 0;
		//sort the array
		Arrays.sort(nums);
		//pointers
		int i = 0; 
		int j = nums.length-1;
		//count 
		int count = 0;
		
		while(i<j) {
			int sum = nums[i]+nums[j];
			if(sum<target) {
				i++;
				count = count + (j -i);
			} else{
				j--;
			} 
		}
		return count++;
	}
	}


