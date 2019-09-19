package nz.ac.eit.Assignment2;

import java.util.*;

public class Dice {

    private int dice1;
    private int dice2;

    public Dice() {
    }

    public static void main(String[] args){
        diceRoll();
    }

    public static int diceRoll() {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        return dice1 + dice2;
    }
}