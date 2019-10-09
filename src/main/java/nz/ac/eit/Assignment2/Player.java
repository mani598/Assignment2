package nz.ac.eit.Assignment2;

import static nz.ac.eit.Assignment2.Dice.*;
import static nz.ac.eit.Assignment2.Game.*;
import static nz.ac.eit.Assignment2.Dealer.*;

public class Player {
    public static void player(){
        boolean playerLoop = true;
        playerSum = diceRoll();
        System.out.println("You started out with: " + playerSum + "\n");
        while (playerLoop) {
            if (playerSum < 21) {
                System.out.println("Would you like to throw the dices again? y/n");
            }
            if (playerSum > 21) {
                System.out.println("You lost by exceeded 21");
                dealerWin++;
                game();
            }
            if (playerSum == 21) {
                System.out.println("Blackjack you win!");
                winCounter++;
                game();
            }

            String gameInput = console.nextLine();
            switch (gameInput) {
                case "y":
                    playerSum += diceRoll();
                    System.out.println("You now got: " + playerSum);
                    break;

                default:
                    System.out.println("The input key "+gameInput+" is not supported, please enter y/n");
                    playerLoop = false;
                    break;
            }
        }
    }
}
