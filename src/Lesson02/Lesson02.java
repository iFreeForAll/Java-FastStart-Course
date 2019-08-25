package Lesson02;

import java.util.Scanner;

//code from the 2nd lesson of the course + HW
//using scanner and making a simple calculator

public class Lesson02 {
    public static void main(String[] args) {
//        //Using scanner
//        System.out.print("Enter your number: ");
//        Scanner sc = new Scanner(System.in); //scanner allows to read the input from user
//        int a = sc.nextInt(); //initializing "a", and reading user's input from the console
//        System.out.println("a = " + a);

        System.out.println("------------------------------------");
        //making a simple console calculator
        Scanner sc = new Scanner(System.in);
        double x, y;
        double result = 0;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplying");
        System.out.println("4. Division"); //HW
        System.out.print("Enter the operation: ");
        int operation = sc.nextInt();

        System.out.print("Enter first number: ");
        x = sc.nextInt();
        System.out.print("Enter second number: ");
        y = sc.nextInt();

        //simple
        if (operation == 1) {
            result = x + y;
        } else if (operation == 2) {
            result = x - y;
        } else if (operation == 3) {
            result = x * y;
        } else if (operation == 4 && y != 0) {
            result = x / y;
        } else {
            System.out.println("Wrong operation!");
        }
        
        System.out.println("Result: " + result);
    }
}
