package Lesson05;

//code from the 5th lesson of the course
//final version of the game "Guess the Number"
//now it has 3 levels, but I removed the function where user picks the range
//added "switch case"

import java.util.Scanner;

public class GuessTheNumberV3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your goal is to guess my number!");

        for (int i = 10; i <= 30 ; i += 10) {
            switch (i) {
                case (10):
                    System.out.println("Level 1!");
                    break;
                case (20):
                    System.out.println("Level 2!");
                    break;
                case (30):
                    System.out.println("Final Level!");
                    break;
                default:
                    System.out.println("Something's wrong, huh...");
                    break;
            }
            playLevel(i);
        }
        sc.close();
    }

    //creating a method playLevel
    //it's the code we had in main, but now it's in a method
    private static void playLevel(int range) {
        int rndNum = (int) (Math.random() * range);
        while(true) {
            System.out.print("Pick a number between 0 and " + range + ": ");
            int guessedNum = sc.nextInt();

            if (guessedNum < rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too low!");
            } else if (guessedNum > rndNum) {
                System.out.println("Your guess is " + guessedNum + ", is too high!");
            } else {
                System.out.println();
                System.out.println("Congratulations! Thank you for playing :)");
                break;
            }
        }
    }
}