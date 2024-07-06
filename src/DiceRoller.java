/* Author: Randall Carbonel
 * Date: 7/5/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that rolls a pair of six-sided dice.
 * Specifications:
 *      - The application should display special messages for two ones (snake eyes) and two sixes (box cars).
 *      - The application should use static methods to organize its code.
 *      - The application should continue only if the user enters “y” or “Y” at the “Roll again?” prompt.
 */

import java.util.Scanner;

public class DiceRoller {

    // Print out the name of the program
    private static void greeter() {
        System.out.println();
        System.out.println("Dice Roller");
        System.out.println();
    }

    // Roll the die
    public static int rollTheDie() {
        return (int) (Math.random() * 6) + 1;
    }

    // Check for special conditions
    public static void specialMessages(int die1, int die2) {

        // Check for Snake eyes
        if (die1 == 1 && die2 == 1) {
            System.out.println("Snake eyes!");
        }

        // Check for Boxcars.
        else if (die1 == 6 && die2 == 6) {
            System.out.println("Boxcars!");
        }
    }

    public static void main(String[] args) {

        // Run the greeter
        greeter();

        // Create the scanner
        Scanner sc = new Scanner(System.in);

        // Ask the user if they would like to roll the dice
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.nextLine();

        // While loop so the program runs until the user exits
        while (choice.equalsIgnoreCase("y")) {

            // Roll the dice
            int die1 =  rollTheDie();
            int die2 = rollTheDie();
            int total = die1 + die2;

            // Print the roll results
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + total);

            // Check for special messages
            specialMessages(die1, die2);

            // Ask the user if they would like to roll again
            System.out.print("Roll the dice? (y/n): ");
            choice = sc.nextLine();
        }
    }
}