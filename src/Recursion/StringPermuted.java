package Recursion;

import java.util.Scanner;

public class StringPermuted {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String S = "";
        String U = userInput.nextLine();
        int k = U.length();
    }
    public static void PrintPermutation(int k, String S, String U){
        for(int i = 0; i < U.length(); i++){
            String c = U.substring(i, i+1);
            U = U.substring(0, i) + U.substring(i+1, k); //remove 
            
        }
    }
    
}
