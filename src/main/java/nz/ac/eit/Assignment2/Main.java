package nz.ac.eit.Assignment2;

import static nz.ac.eit.Assignment2.Dice.*;
import static nz.ac.eit.Assignment2.Game.*;
import java.util.*;

public class Main {
    public static int playerSum, gameCounter = 0, winCounter = 0, computerWin = 0, winStreak = 0;
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args){
        game();
    }

    public static void computerThrow(){
        int computerSum = diceRoll();
        int computerLow = 17;

        do {
            computerSum += diceRoll();
            if (computerSum >= 17) {
                if (computerSum > 21 || computerSum < playerSum) {
                    System.out.printf("You got: %d\nThe computer got: %d, you win!\n", playerSum, computerSum);
                    winCounter++;
                    winStreak++;
                    break;
                }else if (computerSum > playerSum) {
                    System.out.printf("The computer got: %d\nYou got: %d, the computer wins.\n", computerSum, playerSum);
                    computerWin++;
                    winStreak = 0;
                    break;
                }else if (playerSum == computerSum) {
                    System.out.printf("It's a draw, \nYou got: %d \ncomputer got: %d \n", playerSum, computerSum);
                    break;
                }
            }
        } while (computerSum < computerLow);
    }
}
