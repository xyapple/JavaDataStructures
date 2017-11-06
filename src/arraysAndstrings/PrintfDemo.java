package arraysAndstrings;

import java.text.NumberFormat;
import java.util.Locale;

public class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = "abc";
		 
		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%sEND %n", aString);
		System.out.printf("START%4sEND %n", aString);
		System.out.printf("START%2sEND %n", aString);
		System.out.println();
		
		char oneCharacter = 'Z';
		 System.out.println("Character output:");
		 System.out.println("START1234567890");
		 System.out.printf("START%cEND %n", oneCharacter);
		 System.out.printf("START%4cEND %n", oneCharacter);
		 System.out.println();
		 
		 String aString1 = "Jelly beans";
		    double d = 123.1234567890;
		    System.out.println("START1234567890");
		    System.out.printf("START%sEND %n %9.4f %n", aString1, d);
		    System.out.println("================");
		    NumberFormat exerciseFormatter =
                    NumberFormat.getCurrencyInstance(Locale.US);
   double d1 = 1.2345, d2 = 15.67890;
   System.out.println(exerciseFormatter.format(d1));
   System.out.println(exerciseFormatter.format(d2));

	}

}
