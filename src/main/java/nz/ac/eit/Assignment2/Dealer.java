package nz.ac.eit.Assignment2;

import static nz.ac.eit.Assignment2.Dice.*;
import static nz.ac.eit.Assignment2.Game.*;
import java.util.*;

public class Dealer {
    public static int playerSum, gameCounter = 0, winCounter = 0, dealerWin = 0;
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws InputShouldBeYOrNException {
        game();
    }

    public static boolean dealerThrow(){
        int dealerSum = diceRoll();
        int dealerLow = 17;

        do {
            dealerSum += diceRoll();
            if (dealerSum >= 17) {
                if (dealerSum > 21 || dealerSum < playerSum) {
                    System.out.printf("You got: %d\nThe dealer got: %d, you win!\n", playerSum, dealerSum);
                    winCounter++;
                    break;
                }else if (dealerSum > playerSum) {
                    System.out.printf("The dealer got: %d\nYou got: %d,\n the dealer wins.\n", dealerSum, playerSum);
                    dealerWin++;
                    break;
                }else if (playerSum == dealerSum) {
                    System.out.printf("It's a draw, \nYou got: %d \ndealer got: %d \n", playerSum, dealerSum);
                    break;
                }
            }
        } while (dealerSum < dealerLow);
        return false;
    }

    public void result(int i) {

    }


    }

