package nz.ac.eit.Assignment2;

import static nz.ac.eit.Assignment2.Dealer.dealerThrow;
import static nz.ac.eit.Assignment2.Player.player;

public class Exception extends Game{
    public String input(){
        String gameInput = "";
        if (gameInput == "y"){
            player();
            dealerThrow();
        }else if (gameInput == "n"){
            System.out.println("... Goodbye ...");
        }else {

        }
        return gameInput;
    }

}
