package Recursion;

import java.util.Scanner;

public class StringPermuted {
    public static void main(String[] args) {
     /*   Scanner userInput = new Scanner(System.in);
        String U = userInput.nextLine();
        String S = "";
        int k = U.length();*/
        PrintPermutation(3, "", "ABC");
        //PrintPermutation(k, S,U);
    }
    
    private static void PrintPermutation(int k,String S, String U) {
        if (k == 0) {
            System.out.println(S);  // base case
        }  else {
            for (int i = 0; i < k; i++) {
                // choose
                String c = U.substring(i, i+1);
                String newU = U.substring(0, i) + U.substring(i+1, U.length());        // remove firstLetter from s
                String newS = S + c;
             
                    // explore
                    PrintPermutation(k, newU, newS);
                }
            }
        }
    }
    

