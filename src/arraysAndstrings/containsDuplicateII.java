//219. Contains Duplicate II
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j 
//in the array such that nums[i] = nums[j] 
//and the absolute difference between i and j is at most k.
package arraysAndstrings;
import java.util.*;

public class containsDuplicateII {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		isDuplicate(numbers, 2);
	}
	public static boolean isDuplicate(int[] nums, int k) {
		if(nums == null || nums.length == 0) {
			return false;
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(hm.containsKey(nums[i])) {
				int j = hm.get(nums[i]);
				if(i - j <= k) {
					System.out.println("true");
					return true;
				}
				
				hm.put(nums[i],i);
				
			}			
			
		}
		System.out.println("false");
		return false;
	}
	

}
