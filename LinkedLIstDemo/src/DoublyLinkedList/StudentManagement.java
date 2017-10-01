package DoublyLinkedList;

import java.io.IOException;
import java.util.Scanner;

public class StudentManagement {
    private static DoublyLinkedList<Student> studentList = new DoublyLinkedList<Student>();
    private static Scanner userInput = new Scanner(System.in);
    public static boolean valid = false;
    
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Student management system ");
        displayUserMenu();
    }

    /**
     * Display user menu for user to choose
     */
    private static void displayUserMenu() throws IOException {
        // user choice for student menu
        int userChoice = 0;
        System.out.println("1. Add a Student.");
        System.out.println("2. Remove a Student. ");
        System.out.println("3. Update student GPA. ");
        System.out.println("4. Display a student information. ");
        System.out.println("5. Display all students. ");
        System.out.println("6. Exit");
        
        do {
            
            if (userInput.hasNextInt()) {
                userChoice = userInput.nextInt();
                //In order for user not to skip the next line!
                userInput.nextLine();
            } else {
                System.out.println("Number not entered, try again");
                // discarded bad input
                userInput.next();
                
            }
            //check valid selection
            if (userChoice < 1 || userChoice > 6) {
                System.out.println("Please enter number from 1 to 6.");
                
            }
            switch (userChoice) {
                case 1:
                    
                   // addStudent();
                    
                    break;
                case 2:
                   // removeStudent();
                    break;
                case 3:
                   // updateGPA();
                    break;
                case 4:
                   // findStudent();
                case 5:
                   // displayAll();
                case 6:
                    System.out.println("GoodBye!");
                    System.exit(0);
                    break;
            }
        }
        while (userChoice != 6);
    }
    /**
     * Add Student method
     */
    
    
    
    
}