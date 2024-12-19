package TASK;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random Number is " + randomNumber);

        while (true) {
            System.out.println("Enter your guess (1-100):");
            Scanner sc = new Scanner(System.in);

            int playerGuess = sc.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Correct! you win");
                break;

            } else if (randomNumber > playerGuess) {
                System.out.println("The  number is higher, GUess again. ");
            } else {
                System.out.println("Nope the number is lower. guess again.");
            }


        }
    }
}