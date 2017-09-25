package JavaOOP.catcherror;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.println("Please enter first num: ");
            int a = input.nextInt();
            System.out.println("Please enter second num: ");
            int b = input.nextInt();
            System.out.println("a/b result : "+ (a/b));
            
        }catch(InputMismatchException e){
            System.out.println("Please enter an integer.");
        }catch(ArithmeticException e){
            System.out.println("b cannot be 0. ");
        }catch (Exception e){
            System.out.println("Unknown error. ");
        }
        System.out.println("Program is done.");
    }
}
