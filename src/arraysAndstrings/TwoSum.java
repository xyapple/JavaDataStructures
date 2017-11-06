//Two Sum
//Given an array of integers, find two numbers such that they add up to a specific target number.
package arraysAndstrings;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		int[] test = {1,2,3,4,34,12,76,12};
		sumOfTwo_Hash(test, 80);
		
	}
	public static void sumOfTwo_Bruce(int[] nums, int target) {

		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j<nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					
					System.out.println("the sum of target are: " + nums[i] +" , " +nums[j]);
					
				}
				
			}
	
		}
		
	}
	
	public static int[] sumOfTwo_Hash(int[] nums, int target) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] answer = new int[2];
		for(int i = 0; i < nums.length; i++) {
		
			if(hm.containsKey(nums[i])) {
				//return 
				answer[0] = (int)hm.get(nums[i]);
				answer[1] = i;
				break;
			}else {
				hm.put(target-nums[i], i);
			}
			
		}
		System.out.println(answer[0] +" , "+answer[1]);
		return answer;
		
	}

}
