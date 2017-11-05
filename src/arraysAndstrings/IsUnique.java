package arraysAndstrings;

import java.util.Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public boolean isUnique(String test) {
		char[] c = test.toCharArray();
		Arrays.sort(c);
		for(int i = 0; i<c.length; i++) {
			if(c[i-1]==c[i]) {
				return true;
			}
		}
		return false;
	}
	

}
