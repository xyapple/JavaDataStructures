package arraysAndstrings;

import java.util.Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// test the input
		String t = "safe";
		isUnique(t);
	}	
	public static void isUnique(String test) {
		boolean[] chars = new boolean[26];
		String upper = test.toUpperCase();
		//sort the array before the search
		for(int i = 0; i<upper.length(); i++) {
			//create a character array char
			char c = upper.charAt(i);		
			if('A' <= c && c<= 'Z') {
				if(chars[(int)c - 'A']) {
					System.out.println("not unique");
					return;
				}
				chars[(int)c - 'A'] = true;
			}
		}
		System.out.println("unique");
	}
	

}
