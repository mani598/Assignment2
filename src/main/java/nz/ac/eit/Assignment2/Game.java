package nz.ac.eit.Assignment2;

import static nz.ac.eit.Assignment2.Main.*;
import static nz.ac.eit.Assignment2.Player.*;

public class Game {
    public static void game(){
        boolean gameLoop = true;
        while (gameLoop) {
            if (gameCounter == 0) {
                System.out.println("Welcome to the Blackjack Dice game" + "\n" + "Would you like to start the game? y/n");
            } else {
                results();
                System.out.println("Would like to play again?\ty/n");
            }
            gameCounter++;

            String gameInput = console.nextLine();
            switch (gameInput) {
                case "y":
                    player();
                    computerThrow();
                    break;

                default:
                    System.out.println("... Goodbye ...");
                    gameLoop = false;
                    break;
            }
        }
    }

    public static void results(){
        System.out.printf("\nYou have played:\t%d times\nGames won:\t%d \nGames lost:\t%d \n", gameCounter, winCounter, computerWin);
    }
}
