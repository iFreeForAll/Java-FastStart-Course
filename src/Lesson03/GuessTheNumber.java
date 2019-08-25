package Lesson03;

//code from the 3rd lesson of the course
//using random
//making the game "Guess the Number"
//+HW - user sets the range

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your goal is to guess my number!");
        System.out.println("Please enter the range!");
        System.out.print("Lower bracket: ");
        int lowRange = sc.nextInt();
        System.out.print("Upper bracket: ");
        int upRange = sc.nextInt();

        //Math.random returns 0.0 <= Math.random() < 1.0
        //since it returns "double", we use "(int)"
        int rndNum = (int) (Math.random() * (lowRange - upRange + 1)) + upRange;

        //simple while statement
        //continually executes a block of statements while a particular condition is true
        while(true) {
            System.out.print("Pick a number between " + lowRange+ " and " + upRange + ": ");
            int guessedNum = sc.nextInt();
            //simple if statement
            //block of code to be executed, if a specified condition is true
           if (guessedNum < rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too low!");
            } else if (guessedNum > rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too high!");
            } else {
                System.out.println("You won!");
                break; //to break infinite "while"
            }
        }
        sc.close();
    }
}