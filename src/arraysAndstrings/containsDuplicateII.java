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
		HashSet<Integer> hm = new HashSet<Integer>();
		for(int i=0; i <nums.length; i++) {
			if(i > k) {
				hm.remove(nums[i-k-1]);
//				System.out.println("This is duplicate");
			}
			if(!hm.add(nums[i])) {
				System.out.println("This is duplicate");
				return true;
			}
		}
		return false;
	}
	

}
