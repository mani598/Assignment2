package nz.ac.eit.Assignment2;

import org.junit.Before;
import org.junit.Test;

import static nz.ac.eit.Assignment2.Dealer.*;
import static nz.ac.eit.Assignment2.Player.*;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player mmm;

    @Before
    public void setUp() throws Exception {
        mmm = new Player();
        playerSum = 21;
    }

    @Test
    public void player() {
        int mmm;
        boolean result = playerSum == 21;
        assertEquals("", true,result);
    }
}