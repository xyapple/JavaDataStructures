//9. Palindrome Number
//Revers a number without using extra space
//For example: 1221 ==> 1221/10=122.1 1221%10 = 2

package arraysAndstrings;

public class PalindromeNumbe {
	public static void main(String[] args) {
		
		System.out.println(isPalindrame(1221));
		
	}
	public static boolean isPalindrame(int x) {
		if(x< 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		
		int revertedNum = 0;
		while(x > revertedNum) {
			revertedNum = revertedNum * 10 + x % 10;
			 x /= 10;
		}
		return x == revertedNum || x == revertedNum ;
	}

}
