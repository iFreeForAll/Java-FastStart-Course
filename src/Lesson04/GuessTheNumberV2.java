package Lesson04;

//code from the 4th lesson of the course
//using methods
//upgrading the game "Guess the Number"

import java.util.Scanner;

public class GuessTheNumberV2 {
    //now scanner is out of main class
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your goal is to guess my number!");
        System.out.println("Please enter the range!");

        System.out.print("Lower bracket: ");
        int lowRange = sc.nextInt();

        System.out.print("Upper bracket: ");
        int upRange = sc.nextInt();

        int rndNum = (int) (Math.random() * (lowRange - upRange + 1)) + upRange;

        playLevel(lowRange, upRange, rndNum);

        sc.close();
    }

    //creating a method playLevel
    //it's the code we had in main, but now it's in a method
    private static void playLevel(int lowRange, int upRange, int rndNum) {
        while(true) {
            System.out.print("Pick a number between " + lowRange + " and " + upRange + ": ");
            int guessedNum = sc.nextInt();

            if (guessedNum < rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too low!");
            } else if (guessedNum > rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too high!");
            } else {
                System.out.println("You won!");
                break;
            }
        }
    }
}
