package oop;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputStringTokenizer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		 System.out.println("Enter two numbers on a line.");
		 System.out.println("Place a comma between the numbers.");
		 System.out.println("Extra blank space is OK.");
		 
		 String inputLine = in.nextLine();
		 String delimiters = ", "; //Comma and blank space
		 StringTokenizer numberFactory = new StringTokenizer(inputLine, delimiters);
		 String s1 = null;
		 String s2 = null;
		 if(numberFactory.countTokens()>=2) {
			 s1=numberFactory.nextToken();
			 s2=numberFactory.nextToken();
			 
		 }else {
			 System.out.println("Fatal Error.");
			 System.exit(0);
		 }
		 double number1 = Double.parseDouble(s1);
		 double number2 = Double.parseDouble(s2);
		 System.out.print("You input ");
		 System.out.println(number1 + " and " + number2);
	}
}
