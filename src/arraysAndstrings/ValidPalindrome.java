//125. Valid Palindrome

/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 */
package arraysAndstrings;

import java.util.*;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "aa";
		isPalindrome(test);
		//System.out.println("Run");

	}

	public static boolean isPalindrome(String s) {
		   if (s == null || s.length() == 0) {
	            return true;
	        }
		// use two pointers
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			else if (!Character.isLetterOrDigit(s.charAt(j))) {
				j++;
			}
			else{
				if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				System.out.println("false");
				return false;
			}
			i++;
			j--;
			}

		}
		System.out.println("true");
		return true;
	}

}
