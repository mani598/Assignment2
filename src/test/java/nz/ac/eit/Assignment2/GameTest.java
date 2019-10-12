package nz.ac.eit.Assignment2;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static nz.ac.eit.Assignment2.Dealer.dealerThrow;
import static nz.ac.eit.Assignment2.Game.results;
import static nz.ac.eit.Assignment2.Player.*;
import static org.junit.Assert.*;

public class GameTest {

    private Game game;
    private Player player;


    @Before
    public void setup() {
        game = new Game();
        player = new Player();
    }

    @Test
    public void test() {
        Game game = new Game();
        int result = game.game();
        Scanner scan = new Scanner(System.in);


    }
}
