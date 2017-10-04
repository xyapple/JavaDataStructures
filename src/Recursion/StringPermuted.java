package Recursion;

import java.util.Scanner;

public class StringPermuted {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String S = "";
        String U = userInput.nextLine();
        int k = U.length();
        //PrintPermutation(3, "", "ABC");
        PrintPermutation(k, S,U);
    }
    public static void PrintPermutation(int k, String S, String U){
        for(int i = 0; i < U.length(); i++){
            
            String c = U.substring(i, i+1);
            
            U = U.substring(0, i) + U.substring(i+1, U.length()); //remove the first char of U which meanning only adding the rest of substring
            S = c + U.substring(0, i);
            if(k == 1){
                System.out.println(S);
            } else {
                PrintPermutation(k,S,U);
            }
            
           S = S.substring(0, S.length()-1);
           U = U.substring(0, i) + c + U.substring(i);
        /*   System.out.println("what is U: "+U);
            System.out.println("what is S: "+S);*/
        }
    }
    
}
