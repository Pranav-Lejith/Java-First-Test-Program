//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//        int x;
//        x=15;
//        for(int i=1; i<=x; i++)
//        {
//            System.out.println(" i= "  + i);
//        }
//        String greeting = "Hello";
//        int greetLength = greeting.length();
//        System.out.println(greetLength);
//
//    }
//}

import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        System.out.println("Created by Amphibiar(Pranav Lejith)(7th October 2024)");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        System.out.println("Length of username is "+ userName.length()); // Output user input
        System.out.println("ThankYou");
    }
}