package arraysAndstrings;
//217. Contains Duplicate
//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
//and it should return false if every element is distinct.

//Use HashSet
import java.util.*;

public class containsDuplicate1 {

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5,6};
		
		isDuplicate(n);

	}
	public static boolean isDuplicate(int[] nums) {
		//hashSet array
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int n : nums) {
			if(hs.contains(n)) {
				return true;
			}
			hs.add(n);
		}
		System.out.println("There is duplicate.");
		return false;
	}

}
